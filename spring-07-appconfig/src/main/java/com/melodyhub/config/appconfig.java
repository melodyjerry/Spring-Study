package com.melodyhub.config;

import com.melodyhub.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//这个也会Spring容器托管,注册到容器中,因为他本米就是一个@Component
// @Configuration表这是一个配置类,就像我们之前看的beans.xml，类似于<beans>标签
@Configuration
@ComponentScan("com.melodyhub.pojo") //开启扫描
//@Import(KuangConfig2.class)
public class appconfig {
    //注册一个bean , 就相当于我们之前写的一个bean 标签
    //这个方法的名字,就相当于bean 标签中的 id 属性 ->getUser
    //这个方法的返同值,就相当于bean 标签中的class 属性 ->User

    @Bean
    public User getUser(){
        return new User(); //就是返回要注入到bean的对象!
    }
}

