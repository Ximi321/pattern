package com.ximi.design.pattern.state;

/**
 * 状态接口
 *
 * @author Ximi
 * @since 2020/08/03
 */
public interface State {

    public String getName();

    //定义状态相应的行为

    /**
     * 增加普通的能力
     *
     * @return
     */
    public void increaseCommonPower(int score);

    /**
     * 增加超级能力
     *
     * @return
     */
    public void increaseSuperPower(int score);

    /**
     * 减少普通的能力
     *
     * @return
     */
    public void decreaseCommonPower(int score);


}
