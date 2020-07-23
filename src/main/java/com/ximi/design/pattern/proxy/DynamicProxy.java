package com.ximi.design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class DynamicProxy {

    public Object createProxy(Object object){
        Class<?>[] interfaces = object.getClass().getInterfaces();
        DynamicProxyHandler handler = new DynamicProxyHandler(object);
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                interfaces,handler);
    }

    public class DynamicProxyHandler implements InvocationHandler{

        public Object proxyObject;
        public DynamicProxyHandler(Object proxyObject){
            this.proxyObject = proxyObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long startTime = System.currentTimeMillis();
            Object result = method.invoke(proxyObject,args);
            System.out.println(method.getName() + "耗时:" + (System.currentTimeMillis() - startTime));
            return result;
        }
    }

    public static void main(String[] args) {
        DynamicProxy dynamicProxy = new DynamicProxy();
        IUserController userController = (IUserController) dynamicProxy.createProxy(new UserController());
        userController.registerUser(new User());
        userController.cancelUser(new User());
    }
}
