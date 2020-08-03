package com.ximi.design.pattern.state;

/**
 * 死亡状态
 *
 * @author Ximi
 * @since 2020/08/03
 */
public class DeadState implements State {

    private StateManager stateManager;

    public DeadState(StateManager stateManager) {
        this.stateManager = stateManager;
    }

    @Override
    public String getName() {
        return StateEnum.dead.getName();
    }

    @Override
    public void increaseCommonPower(int score) {
        //死亡状态,不操作
    }

    @Override
    public void increaseSuperPower(int score) {
        //死亡状态,不操作
    }

    @Override
    public void decreaseCommonPower(int score) {
        //死亡状态,不操作
    }

}
