package com.javaman.obsever;

/**
 * @author pengzhe
 * @date 2018/10/21 14:41
 * @description 具体观察者
 */

public class ConcreteObsever implements Obsever {

    @Override
    public void update() {
        System.out.println("收到信息并进行处理");
    }
}
