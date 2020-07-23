package com.ximi.design.pattern.adapter;

/**
 * 类适配器
 * 使用继承把 Adaptee 适配成 Itarget
 * 适用场景:
 * 如果Adaptee 接口很多，并且和ITarget 接口定义大部分是相同的，我们推荐使用类适配器。
 * 因为ClassAdapter 可以复用 Adaptee 的接口。
 *
 * @since 2020/07/23
 * @since Ximi
 */
public class ClassAdapter extends Adaptee implements ITarget {

    @Override
    public void fun1() {  //fun1 的功能 直接使用 Adaptee.funA
        super.funA();
    }

    @Override
    public void fun2() {
        // 重新实现
    }

    // funC 不需要实现,直接继承Adaptee

}
