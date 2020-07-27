package com.ximi.design.pattern.observer;

public class Main {

    public static void main(String[] args) {
        //创建事件总线
        EventBus eventBus = new SyncEventBus();
        ObserverA observerA = new ObserverA();

        System.out.println("................................");
        eventBus.register(observerA);
        eventBus.post(new EventA());
        eventBus.post(new EventB());

        System.out.println("................................");
        ObserverB observerB = new ObserverB();
        eventBus.register(observerB);
        eventBus.post(new EventA());
        eventBus.post(new EventB());

        System.out.println("................................");
        eventBus.unregister(observerA);
        eventBus.post(new EventA());
        eventBus.post(new EventB());

        System.out.println("................................");
        eventBus.post(new EventAA());
    }

}
