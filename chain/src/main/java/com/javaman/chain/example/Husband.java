package com.javaman.chain.example;

/**
 * @author pengzhe
 * @date 2018/11/7 13:52
 */
public class Husband implements IHandler {
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("妻子请示是:" + women.getRequest());
        System.out.println("丈夫表示同意");
    }
}
