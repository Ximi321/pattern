package com.ximi.design.pattern.decorator;

/**
 * 强化功能1
 */
public class Strengthen1Function implements IFunction {

    private IFunction function;

    public Strengthen1Function(IFunction function) {
        this.function = function;
    }

    @Override
    public void fun1() {
        System.out.println("Strengthen1Function 强化了fun1功能:");
        function.fun1();
    }

    @Override
    public void fun2() {
        System.out.println("Strengthen1Function 强化了fun1功能:");
        function.fun1();
    }
}
