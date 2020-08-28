package com.melodyhub.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

///用这个类，自动生代理
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    public Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 得到生成的代理类 -> 固定的代码
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(), this);
    }

    // 处理代理实例并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        log(method.getName());
        seeHouse();
        // 动态代理的本质，就是使用反射机制实现的
        // invoke()执行它真正要执行的方法
        Object result = method.invoke(rent, args);
        fee();
        return result;
    }

    public void seeHouse() {
        System.out.println("看房子");
    }

    public void fee() {
        System.out.println("收中介费");
    }
}
