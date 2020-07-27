package com.ximi.design.pattern.observer;

/**
 * 观察者A
 *
 * @author Ximi
 * @since 2020/07/27
 */
public class ObserverB {

    /**
     * 观察 EventB,以及 EventB 的子类
     * @param event
     */
    @Subscribe
    public void funB(EventB event){
        System.out.println("ObserverB 接受到" + event.getClass().getName());
    }

    /**
     * 观察 EventA,以及 EventA 的子类
     * @param event
     */
    @Subscribe
    public void funA(EventA event){
        System.out.println("ObserverB 接受到" + event.getClass().getName());
    }

}
