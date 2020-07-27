package com.ximi.design.pattern.observer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObserverAction {

    private Object target;
    public Method method;

    public ObserverAction(Object target, Method method) {
        this.target = target;
        this.method = method;
    }

    public void execute(Object event){
        try {
            method.invoke(target,event);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public Class<?> getEventType(){
        Class[] classes = method.getParameterTypes();
        if(classes.length >= 1){
            return classes[0];
        }
        return null;
    }

    public Object getTarget() {
        return target;
    }
}
