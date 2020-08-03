package com.ximi.design.pattern.state;

public class Main {

    public static void main(String[] args) {
        StateManager stateManager = new StateManager();
        print(stateManager);
        stateManager.increaseCommonPower();
        print(stateManager);
        stateManager.increaseSuperPower();
        stateManager.increaseSuperPower();
        print(stateManager);
        stateManager.decreaseCommonPower();
        stateManager.decreaseCommonPower();
        print(stateManager);
        stateManager.decreaseCommonPower();
        print(stateManager);
        stateManager.increaseSuperPower();
        print(stateManager);
    }

    public static void print(StateManager stateManager){
        System.out.printf("当前状态:%s,积分:%d\n",stateManager.getState().getName(),stateManager.getScore());
    }
}
