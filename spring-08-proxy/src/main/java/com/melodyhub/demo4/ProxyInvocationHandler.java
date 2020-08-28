package com.melodyhub.demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

///用这个类，自动生代理
public class ProxyInvocationHandler implements InvocationHandler {

    // Foo f =(Foo) Proxy.NewProxyInstance(Foo. Class.GetClassLoader(),
    // new Class<?>[] { Foo.Class },
    // handler);

    // 被代理的接口
    public Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // 得到生成的代理类 -> 固定的代码
    public Object getProxy() {
        // newProxyInstance() -> 生成代理对象，就不用再写具体的代理类了
        // this.getClass().getClassLoader() -> 找到加载类的位置
        // hostMaster.getClass().getInterfaces() -> 代理的具体接口
        // this -> 代表了接口InvocationHandler的实现类ProxyInvocationHandler
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    // 处理代理实例并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //前置通知
        pre();

        //打印日志,通过反射的方式
        log(method.getName());

        // 动态代理的本质，就是使用反射机制实现的
        // invoke()执行它真正要执行的方法
        Object result = method.invoke(target, args);

        //后置通知
        post();

        return result;
    }

    public void pre() {
        System.out.println("[前置通知]");
    }

    public void post() {
        System.out.println("[后置通知]");
    }

    //日志打印
    public void log(String msg) {
        System.out.println("[Debug]执行了" + msg + "方法");
    }
}
