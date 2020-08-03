package com.ximi.design.pattern.observer;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 观察者的注入
 */
public class ObserverRegister {

    private Map<Class<?>, List<ObserverAction>> registerMap = new ConcurrentHashMap<>();
    private List<ObserverAction> allActions = new LinkedList<>();

    /**
     * 注册
     *
     * @param register
     */
    public void register(Object register) {
        List<ObserverAction> list = findAllObserverActions(register);
        allActions.addAll(list);
        updateRegister(allActions);
    }

    /**
     * 删除注册的观察者
     *
     * @param register
     */
    public void unregister(Object register) {
        for (Map.Entry<Class<?>, List<ObserverAction>> entry : registerMap.entrySet()) {
            List<ObserverAction> actions = entry.getValue();
            removeAction(actions, register);
        }
        removeAction(allActions, register);
    }


    /**
     * 移除集合中的
     *
     * @param collection
     * @param object
     */
    private void removeAction(Collection<ObserverAction> collection, Object object) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            ObserverAction action = (ObserverAction) iterator.next();
            if (action.getTarget() == object) {
                iterator.remove();
            }
        }
    }

    /**
     * 获取观察者方法
     *
     * @param event 事件
     * @return
     */
    public List<ObserverAction> getObserverAction(Object event) {
        Class<?> classType = event.getClass();
        if (registerMap.containsKey(classType)) {
            return registerMap.get(classType);
        }

        List<ObserverAction> actions = new ArrayList<>();
        for (ObserverAction action : allActions) {
            if (isMatchEventType(classType, action.getEventType())) {
                actions.add(action);
            }
        }
        registerMap.put(classType,actions);
        return actions;
    }

    /**
     * 类型是否匹配
     *
     * @param classType
     * @param targetType
     * @return
     */
    private Boolean isMatchEventType(Class<?> classType, Class<?> targetType) {
        if (classType.equals(targetType)) {
            return true;
        }
        Class<?> superClass = classType.getSuperclass();
        if (superClass == null) {
            return false;
        }
        return isMatchEventType(superClass, targetType);
    }

    /**
     * 更新注册表
     *
     * @param actions
     */
    private void updateRegister(List<ObserverAction> actions) {
        for (ObserverAction action : actions) {
            Class<?> eventType = action.getEventType();
            for (Map.Entry<Class<?>, List<ObserverAction>> entry : registerMap.entrySet()) {
                if (entry.getKey().equals(eventType)) {
                    entry.getValue().add(action);
                }
            }
        }
    }

    /**
     * 寻找全部观察者的方法
     *
     * @param register 注册一个观察者
     * @return
     */
    private List<ObserverAction> findAllObserverActions(Object register) {
        Class<?> clazz = register.getClass();
        List<ObserverAction> actions = new ArrayList<>();
        for (Method method : getSubscibeMethod(clazz)) {
            ObserverAction action = new ObserverAction(register, method);
            actions.add(action);
        }
        return actions;
    }


    /**
     * 获取被 Subscribe.class 注册的方法
     *
     * @param clazz
     * @return
     */
    private List<Method> getSubscibeMethod(Class<?> clazz) {
        List<Method> methods = new ArrayList<>();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.getAnnotation(Subscribe.class) != null && method.getParameterCount() == 1) {
                methods.add(method);
            }
        }
        return methods;
    }

}
