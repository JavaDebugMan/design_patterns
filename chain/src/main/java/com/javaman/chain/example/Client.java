package com.javaman.chain.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author pengzhe
 * @date 2018/11/7 13:53
 */
public class Client {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random random = new Random();
        List<IWomen> iWomenList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            iWomenList.add(new Women(random.nextInt(4), "我要出去逛街"));
        }
        //定义三个请示对象
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();

        for (IWomen women : iWomenList) {
            if (women.getType() == 1) {
                System.out.println("向父亲请示");
                father.handleMessage(women);
            } else if (women.getType() == 2) {
                System.out.println("向丈夫请示");
                husband.handleMessage(women);
            } else if (women.getType() == 3) {
                System.out.println("向儿子请示");
                son.handleMessage(women);
            }
        }

    }
}
