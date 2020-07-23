package com.ximi.design.pattern.decorator;

public class Function implements IFunction {

    @Override
    public void fun1() {
        System.out.println("原始功能:fun1");
    }

    @Override
    public void fun2() {
        System.out.println("原始功能:fun2");
    }
}
