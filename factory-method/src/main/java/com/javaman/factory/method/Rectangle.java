package com.javaman.factory.method;

/**
 * @author pengzhe
 * @date 2018/6/6 12:18
 * @description
 */

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
