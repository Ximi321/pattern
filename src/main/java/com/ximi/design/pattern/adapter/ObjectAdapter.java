package com.ximi.design.pattern.adapter;

/**
 * 对象适配器
 * 使用组合把 adaptee 适配成 ITarget
 * 适用场景:
 * adaptee 和 ITarget 的接口比较多,并且很大部分不一样,可以使用对象适配器。因为组合比继承更加灵活
 *
 * @since 2020/07/23
 * @since Ximi
 */
public class ObjectAdapter implements ITarget {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void fun1() {
        adaptee.funA();
    }

    @Override
    public void fun2() {
        //重新实现
    }

    @Override
    public void funC() {
        adaptee.funC();
    }
}
