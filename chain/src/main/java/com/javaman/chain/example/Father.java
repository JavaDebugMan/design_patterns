package com.javaman.chain.example;

/**
 * @author pengzhe
 * @date 2018/11/7 13:51
 */
public class Father implements IHandler {
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("女儿请示是:" + women.getRequest());
        System.out.println("父亲表示同意");
    }
}
