package com.design.factoty.method;

/**
 * @author pengzhe
 * @date 2018/10/16 19:10
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();
        BlackHuman blackHuman = factory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        YellowHuman yellowHuman = factory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
        WriteHuman writeHuman = factory.createHuman(WriteHuman.class);
        writeHuman.getColor();
        writeHuman.talk();
    }
}
