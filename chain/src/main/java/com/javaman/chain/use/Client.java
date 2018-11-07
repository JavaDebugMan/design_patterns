package com.javaman.chain.use;


import com.javaman.chain.example.IWomen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author pengzhe
 * @date 2018/11/7 14:27
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
        Handle father = new Father();
        Handle husband = new Husband();
        Handle son = new Son();

        father.setNextHandler(husband);
        husband.setNextHandler(son);

        for (IWomen women : iWomenList) {
            father.handleMessage(women);
        }
    }
}
