package com.javaman.factory.method;

/**
 * @author pengzhe
 * @date 2018/6/6 12:20
 * @description
 */

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
