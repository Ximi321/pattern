package com.ximi.design.pattern.state;

/**
 * 强化状态
 *
 * @author Ximi
 * @since 2020/08/03
 */
public class StrongState implements State {

    private StateManager stateManager;

    public StrongState(StateManager stateManager) {
        this.stateManager = stateManager;
    }

    @Override
    public String getName() {
        return StateEnum.strong.getName();
    }

    @Override
    public void increaseCommonPower(int score) {
        stateManager.addScore(score);
        stateManager.setState(new SuperXState(stateManager));
    }

    @Override
    public void increaseSuperPower(int score) {
        stateManager.addScore(score);
        stateManager.setState(new SuperXState(stateManager));
    }

    @Override
    public void decreaseCommonPower(int score) {
        stateManager.addScore(score);
        stateManager.setState(new InitialState(stateManager));
    }
}
