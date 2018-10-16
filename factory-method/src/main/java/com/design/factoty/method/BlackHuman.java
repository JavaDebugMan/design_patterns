package com.design.factoty.method;

/**
 * @author pengzhe
 * @date 2018/10/16 19:00
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑种人");
    }

    @Override
    public void talk() {
        System.out.println("说鸟语");

    }
}
