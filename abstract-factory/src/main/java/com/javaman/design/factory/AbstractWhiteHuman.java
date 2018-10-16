package com.javaman.design.factory;

/**
 * @author pengzhe
 * @date 2018/10/16 19:54
 */
public abstract class AbstractWhiteHuman implements Human {
    //白色人种的皮肤颜色是白色的
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的！");
    }

    //白色人种讲话
    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般说的都是单字节。");
    }
}
