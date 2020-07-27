package com.ximi.design.pattern.observer;

/**
 * 事件总线
 *
 * @author Ximi
 * @since 2020/07/27
 */
public interface EventBus {

    /**
     * 注册一个观察者
     *
     * @param object
     */
    public void register(Object object);

    /**
     * 取消一个注册者
     *
     * @param object
     */
    public void unregister(Object object);

    /**
     * 推送消息
     *
     * @param event
     */
    public void post(Object event);

}
