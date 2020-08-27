package com.melodyhub.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.melodyhub.dao.User"/>
// @Component 组件
@Component
@Scope("singleton")
public class User {
//    public String name = "Jerry";
//    @Value("Melody")
    public String name;

    //相当于<bean id="user" class="com.melodyhub.dao.User" value="Melody"/>
    @Value("Melody")
    public void setName(String name) {
        this.name = name;
    }
}
