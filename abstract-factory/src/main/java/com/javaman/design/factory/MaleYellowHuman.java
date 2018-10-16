package com.javaman.design.factory;

/**
 * @author pengzhe
 * @date 2018/10/16 19:59
 */
public class MaleYellowHuman extends AbstractYellowHuman {
    //黄人男性
    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}
