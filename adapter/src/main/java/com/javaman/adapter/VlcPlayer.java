package com.javaman.adapter;

/**
 * @author pengzhe
 * @date 2018/6/23 22:12
 * @description
 */

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
