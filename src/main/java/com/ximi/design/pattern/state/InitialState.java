package com.ximi.design.pattern.state;

/**
 * 初始状态
 *
 * @author Ximi
 * @since 2020/08/03
 */
public class InitialState implements State {

    private StateManager stateManager;

    public InitialState(StateManager stateManager) {
        this.stateManager = stateManager;
    }

    @Override
    public String getName() {
        return StateEnum.initial.getName();
    }

    @Override
    public void increaseCommonPower(int score) {
        stateManager.addScore(score);
        stateManager.setState(new StrongState(stateManager));
    }

    @Override
    public void increaseSuperPower(int score) {
        stateManager.addScore(score);
        stateManager.setState(new SuperXState(stateManager));
    }

    @Override
    public void decreaseCommonPower(int score) {
        stateManager.addScore(score);
        stateManager.setState(new DeadState(stateManager));
    }
}
