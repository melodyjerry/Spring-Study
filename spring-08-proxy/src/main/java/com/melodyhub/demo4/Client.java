package com.melodyhub.demo4;

import com.melodyhub.demo2.UserService;
import com.melodyhub.demo2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色,不存在
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

        //设置要代理的对象
        proxyInvocationHandler.setTarget(userService);

        //动态生产代理类
        UserService proxy = (UserService) proxyInvocationHandler.getProxy();

        //执行业务操作
        proxy.add();
    }
}
