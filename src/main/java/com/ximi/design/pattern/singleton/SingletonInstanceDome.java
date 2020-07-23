package com.ximi.design.pattern.singleton;

/**
 * 单例设计模式演示Dome
 * @author Ximi
 * @since 2020/07/18
 *
 */
public class SingletonInstanceDome {


    /**
     * 饿汉式
     */
    public static class Singleton1{
        public static Singleton1 instance = new Singleton1();
        private Singleton1(){ }
        public static Singleton1 getInstance(){
            return instance;
        }
    }


    /**
     * 懒汉式
     */
    public static class Singleton2{
        private static Singleton2 instance = null;
        private Singleton2(){ }
        public static synchronized Singleton2 getInstance(){
            if(null == instance){
                instance = new Singleton2();
            }
            return instance;
        }
    }

    /**
     *双重检测
     */
    public static class Singleton3{
        private static Singleton3 instance = null;
        private Singleton3(){}
        public static Singleton3 getInstance(){
            if(null == instance){
                synchronized (Singleton3.class){
                    if(null == instance){
                        instance = new Singleton3();
                    }
                }
            }
            return instance;
        }
    }

    /**
     * 静态内部类
     */
    public static class Singleton4{
        private Singleton4(){}
        private static class Singleton4Hold{
            public static final Singleton4 instance = new Singleton4();
        }
        public static Singleton4 getInstance(){
            return Singleton4Hold.instance;
        }
    }


    /**
     * 枚举
     */
    public enum Singleton5{
        instance;
    }

}
