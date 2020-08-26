package com.melodyhub.pojo;

public class User {
    private String name;

    public User(String nmae){
        this.name = nmae;
    }

    //必须要有无参构造子，没有就会报错！！！
//    public User(){
//        System.out.println("User的无参构造子！");
//    }

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
