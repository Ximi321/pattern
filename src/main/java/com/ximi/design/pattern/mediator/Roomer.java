package com.ximi.design.pattern.mediator;

/**
 * 房客
 *
 * @author Ximi
 * @since 2020/08/09
 */
public class Roomer {

    private String name;

    private Require require;

    public Roomer(String name, Require require) {
        this.name = name;
        this.require = require;
    }

    public Require getRequire() {
        return require;
    }

    public String getName() {
        return name;
    }

    /**
     * 通知
     *
     * @param houseOwner
     */
    public void notify(HouseOwner houseOwner) {
        System.out.printf("房客:%s 收到了房东:%s的通知\n", name, houseOwner.getName());
    }
}
