package com.mdh.spring.bean.xml;

/**
 * 工厂方法 大多数 返回值会是一个接口
 * 根据不同的需求 产出该接口的不同实现
 * @author madonghao
 * @date 2018/11/8
 */
public class StaticFactory {
    public static Foo getFoo() {
        return new Foo();
    }
}
