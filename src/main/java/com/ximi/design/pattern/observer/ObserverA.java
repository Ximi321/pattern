package com.ximi.design.pattern.observer;

/**
 * 观察者A
 *
 * @author Ximi
 * @since 2020/07/27
 */
public class ObserverA {

    /**
     * 观察 EventA,以及 EventA 的子类
     * @param event
     */
    @Subscribe
    public void funA(EventA event){
        System.out.println("ObserverA 接受到" + event.getClass().getName());
    }

}
