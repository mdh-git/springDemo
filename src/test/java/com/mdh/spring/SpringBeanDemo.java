package com.mdh.spring;

import static org.junit.Assert.assertNotNull;
import com.mdh.spring.bean.AnimalConfig;
import com.mdh.spring.bean.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by madonghao on 2018/11/8.
 */
public class SpringBeanDemo {
    @Test
    public void TestGetDoInstance() {
        //应用上下文
        ApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfig.class);

        Dog dog = (Dog) context.getBean("dog");

        assertNotNull(dog);
    }

}
