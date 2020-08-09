package com.ximi.design.pattern.mediator;

import java.util.LinkedList;
import java.util.List;

/**
 * 中介
 *
 * @author Ximi
 * @since 2020/08/09
 */
public class Mediator {

    public List<Roomer> roomerList = new LinkedList<>();
    public List<HouseOwner> houseOwners = new LinkedList<>();

    /**
     * 添加房客
     *
     * @param roomer
     */
    public void addRoomer(Roomer roomer) {

        HouseOwner matchHouseOwner = null;
        for (HouseOwner houseOwner : houseOwners) {
            if (match(roomer, houseOwner)) {
                roomer.notify(houseOwner);
                houseOwner.notify(roomer);
                matchHouseOwner = houseOwner;
                break;
            }
        }

        if (matchHouseOwner != null) {
            houseOwners.remove(matchHouseOwner);
            return;
        }

        roomerList.add(roomer);
    }

    /**
     * 添加房东
     *
     * @param houseOwner
     */
    public void addHouseOwner(HouseOwner houseOwner) {
        Roomer matchRoomer = null;
        for (Roomer roomer : roomerList) {
            if (match(roomer, houseOwner)) {
                roomer.notify(houseOwner);
                houseOwner.notify(roomer);
                matchRoomer = roomer;
                break;
            }
        }

        if (matchRoomer != null) {
            roomerList.remove(matchRoomer);
            return;
        }

        houseOwners.add(houseOwner);
    }

    /**
     * 匹配房东 和 房客
     *
     * @param roomer
     * @param houseOwner
     * @return
     */
    private Boolean match(Roomer roomer, HouseOwner houseOwner) {
        Condition condition = houseOwner.getCondition();
        Require require = roomer.getRequire();
        return match(require, condition);
    }

    /**
     * 房客的需求,和房东的条件进行匹配
     *
     * @param require
     * @param condition
     * @return
     */
    private Boolean match(Require require, Condition condition) {
        return require.getLevel() == condition.getLevel();
    }

}
