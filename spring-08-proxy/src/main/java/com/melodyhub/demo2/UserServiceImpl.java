package com.melodyhub.demo2;

//真实对象
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改一个用户");
    }

    @Override
    public void query() {
        System.out.println("查找一个用户");
    }

    //1.改动原来的代码，对公司是很大的打击
}
