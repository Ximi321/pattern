package com.ximi.design.pattern.decorator;

/**
 * 强化功能2
 */
public class Strengthen2Function implements IFunction {

    private IFunction function;

    public Strengthen2Function(IFunction function) {
        this.function = function;
    }

    @Override
    public void fun1() {
        System.out.println("Strengthen2Function 强化了fun1功能:");
        function.fun1();
    }

    @Override
    public void fun2() {
        System.out.println("Strengthen2Function 强化了fun2功能:");
        function.fun2();
    }
}
