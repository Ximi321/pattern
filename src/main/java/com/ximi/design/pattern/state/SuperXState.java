package com.ximi.design.pattern.state;

/**
 * 牛逼状态
 *
 * @author Ximi
 * @since 2020/08/03
 */
public class SuperXState implements State{

    private StateManager stateManager;

    public SuperXState(StateManager stateManager) {
        this.stateManager = stateManager;
    }

    @Override
    public String getName() {
        return StateEnum.superX.getName();
    }

    @Override
    public void increaseCommonPower(int score) {
        stateManager.addScore(score);
        //状态不发生变化
    }

    @Override
    public void increaseSuperPower(int score) {
        stateManager.addScore(score);
        //状态不发生变化
    }

    @Override
    public void decreaseCommonPower(int score) {
        stateManager.addScore(score);
        stateManager.setState(new StrongState(stateManager));
    }
}
