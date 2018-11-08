package com.mdh.spring.bean.xml;

/**
 * 该方法 会先创建BeanFactory对象 再创建Foo对象
 * spring 调用方法 不需要关系权限修饰符
 * 它是使用反射直接调用
 * @author madonghao
 * @date 2018/11/8
 */
public class Foo {
    public void fun(){
        System.out.println("fun方法被调用");
    }
}
