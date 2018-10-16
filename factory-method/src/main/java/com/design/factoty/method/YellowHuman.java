package com.design.factoty.method;

/**
 * @author pengzhe
 * @date 2018/10/16 18:59
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人");
    }

    @Override
    public void talk() {
        System.out.println("说汉语");
    }
}
