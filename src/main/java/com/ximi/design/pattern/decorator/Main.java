package com.ximi.design.pattern.decorator;

public class Main {

    public static void main(String[] args) {

        IFunction function = new Function();
        function = new Strengthen1Function(function);
        function = new Strengthen2Function(function);
        function.fun1();
        function.fun2();

    }
}
