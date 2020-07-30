package com.ximi.design.pattern.chain;

public class Main {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new FristHandler());
        chain.addHandler(new SecondHandler());
        chain.addHandler(new ThirdHandler());

        chain.handler();
    }
}
