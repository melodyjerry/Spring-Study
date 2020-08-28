package com.melodyhub.diy;

public class DiyPointcut {
    public void before(){
        System.out.println("插入到前面");
        System.out.println("==方法执行前==");
    }

    public void after(){
        System.out.println("==方法执行后==");
        System.out.println("插入到后面");
    }
}
