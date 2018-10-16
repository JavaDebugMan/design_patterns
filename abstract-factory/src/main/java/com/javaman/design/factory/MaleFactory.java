package com.javaman.design.factory;

/**
 * @author pengzhe
 * @date 2018/10/16 20:02
 */
public class MaleFactory implements HumanFactory {
    //生产出黑人男性
    public Human createBlackHuman() {
        // return new MaleBlackHuman();
        return null;
    }

    //生产出白人男性
    public Human createWhiteHuman() {
        // return new MaleWhiteHuman();
        return null;
    }

    //生产出黄人男性
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}
