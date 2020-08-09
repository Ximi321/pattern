package com.ximi.design.pattern.mediator;

/**
 * 房东
 *
 * @author Ximi
 * @since 2020/08/09
 */
public class HouseOwner {

    //名字
    private String name;
    private Condition condition;

    public HouseOwner(String name, Condition condition) {
        this.condition = condition;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Condition getCondition() {
        return condition;
    }

    /**
     * 通知
     *
     * @param roomer
     */
    public void notify(Roomer roomer) {
        System.out.printf("房东:%s 收到了房客:%s的通知\n", name, roomer.getName());
    }

}
