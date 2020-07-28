package com.melodyhub.dao;

public class UserDaoSqlServerImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("SQL Server获取用户数据");
    }
}
