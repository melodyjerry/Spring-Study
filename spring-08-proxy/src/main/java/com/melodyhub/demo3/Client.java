package com.melodyhub.demo3;

public class Client {
    public static void main(String[] args) {
        //真是角色
        Landlord landlord = new Landlord();

        //代理角色 : 现在没有
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

        //通过电泳程序处理角色来处理我们要调用的接口对象
        proxyInvocationHandler.setRent(landlord);

        //这里的proxy就是动态生成的！！！
        //我们并没有去写一个proxy
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();

        proxy.rent();
    }
}
