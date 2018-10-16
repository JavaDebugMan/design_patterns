package com.javaman.design.factory;

/**
 * @author pengzhe
 * @date 2018/10/16 20:01
 */
public class FemaleFactory implements HumanFactory {
    //生产出黑人女性
    public Human createBlackHuman() {
        return null;
        //return new FemaleBlackHuman();
    }

    //生产出白人女性
    public Human createWhiteHuman() {
        // return new FemaleWhiteHuman();
        return null;
    }

    //生产出黄人女性
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
}
