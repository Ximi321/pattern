package com.ximi.design.pattern.state;

public enum StateEnum {

    dead("死亡"),
    initial("初始"),
    strong("加强"),
    superX("牛逼");

    String name;

    StateEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
