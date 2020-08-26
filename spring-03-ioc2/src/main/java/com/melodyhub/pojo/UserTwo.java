package com.melodyhub.pojo;

public class UserTwo {
    private String name;

    //必须要有无参构造子，没有就会报错！！！
    public UserTwo(){
        System.out.println("UserTwo被创建了！！！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name = " + name);
    }
}
