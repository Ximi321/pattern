package com.ximi.design.pattern.factory;

/**
 * 简单工厂模式演示视例
 *
 * @author Ximi
 * @since 2020/07/18
 */
public class SimpleFactoryDome {
    /**
     * 动物抽象类
     */
    public interface Animal {

    }

    /**
     * 猫
     */
    public static class Cat implements Animal {

    }

    /**
     * 狗
     */
    public static class Dog implements Animal {

    }

    /**
     * 简单的工厂类
     */
    public static class AnimalFactory {
        /**
         * 根据动物的名字，创建相应的动物,如果没有相应的动物，就返回null
         *
         * @param name
         * @return
         */
        public static Animal createAnimal(String name) {
            if ("cat".equals(name)) {
                return new Cat();
            } else if ("dog".equals(name)) {
                return new Dog();
            }
            return null;
        }

    }

    public static void main(String[] args) {
        Animal animal  = AnimalFactory.createAnimal("cat");
        System.out.println(animal.getClass().getName());
    }

}
