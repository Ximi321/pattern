package com.ximi.design.pattern.mediator;

public class Main {

    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        Condition condition = new Condition(2);
        HouseOwner houseOwner = new HouseOwner("007",condition);

        Condition condition1 = new Condition(3);
        HouseOwner houseOwner1 = new HouseOwner("008",condition);

        mediator.addHouseOwner(houseOwner);
        mediator.addHouseOwner(houseOwner1);

        Require require = new Require(1);
        Roomer roomer = new Roomer("107",require);

        Require require1 = new Require(2);
        Roomer roomer1 = new Roomer("108",require1);

        mediator.addRoomer(roomer);
        mediator.addRoomer(roomer1);


    }
}
