package com.ximi.design.pattern.state;

/**
 * 状态的管理
 *
 * @author Ximi
 * @since 2020/08/03
 */
public class StateManager {

    private State state;
    private int score;

    public StateManager() {
        this.score = 0;
        this.state = new InitialState(this);
    }

    /**
     * 增加普通的能力
     *
     * @return
     */
    public void increaseCommonPower() {
        state.increaseCommonPower(10);
    }

    /**
     * 增加超级能力
     *
     * @return
     */
    public void increaseSuperPower() {
        state.increaseSuperPower(20);
    }

    /**
     * 减少普通的能力
     *
     * @return
     */
    public void decreaseCommonPower() {
        state.decreaseCommonPower(-10);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void addScore(int score) {
        this.score += score;
    }
}
