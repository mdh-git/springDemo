package com.mdh.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author madonghao
 * @date 2018/11/8
 */
public class HelloWord {
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.print("hello:" + name);
    }

    public static void main(String[] args) {
        //HelloWord he = new HelloWord();

        //1.创建spring的ioc容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        //2.从ioc容器中获取bean实例
        HelloWord helloWorld = (HelloWord) ctx.getBean("helloWorld");
        helloWorld.hello();
    }
}
