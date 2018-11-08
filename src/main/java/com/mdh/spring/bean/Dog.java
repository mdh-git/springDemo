package com.mdh.spring.bean;

import org.springframework.stereotype.Component;

/**
 *
 * @author madonghao
 * @date 2018/11/8
 */
@Component
public class Dog {

    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
