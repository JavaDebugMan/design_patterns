package com.javaman.chain.example;

/**
 * @author pengzhe
 * @date 2018/11/7 13:52
 */
public class Son implements IHandler {
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("母亲请示是:" + women.getRequest());
        System.out.println("儿子表示同意");
    }
}
