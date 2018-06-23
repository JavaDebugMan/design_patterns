package com.javaman.adapter;

/**
 * @author pengzhe
 * @date 2018/6/23 22:12
 * @description
 */

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
