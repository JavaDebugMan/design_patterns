package com.javaman.factory.method;

/**
 * @author pengzhe
 * @date 2018/6/6 12:19
 * @description
 */

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
