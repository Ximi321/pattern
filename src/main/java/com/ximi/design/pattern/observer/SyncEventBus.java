package com.ximi.design.pattern.observer;

import java.util.List;

/**
 * 同步的事件总线
 *
 * @author Ximi
 * @since 2020/07/27
 */
public class SyncEventBus implements EventBus {

    private ObserverRegister register = new ObserverRegister();

    @Override
    public void register(Object object) {
        register.register(object);
    }

    @Override
    public void unregister(Object object) {
        register.unregister(object);
    }

    @Override
    public void post(Object event) {
        List<ObserverAction> actionList = register.getObserverAction(event);
        actionList.forEach(action -> action.execute(event));
    }
}
