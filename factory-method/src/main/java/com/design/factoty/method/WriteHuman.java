package com.design.factoty.method;

/**
 * @author pengzhe
 * @date 2018/10/16 19:01
 */
public class WriteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白种人");
    }

    @Override
    public void talk() {
        System.out.println("说英语");
    }
}
