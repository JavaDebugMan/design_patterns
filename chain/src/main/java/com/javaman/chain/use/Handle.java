package com.javaman.chain.use;

import com.javaman.chain.example.IWomen;

/**
 * @author pengzhe
 * @date 2018/11/7 14:08
 */
public abstract class Handle {

    public static final int FATHER_LEVER_REQUEST = 1;
    public static final int HUSBAND_LEVER_REQUEST = 2;
    public static final int SON_LEVER_REQUEST = 3;

    /**
     * 能处理的级别
     */
    private int lever = 0;
    /**
     * 责任传递,下一个责任人是谁
     */
    private Handle nextHandler;

    /**
     * 每个类都要说明一下自己能处理哪些请求
     *
     * @param lever
     */
    public Handle(int lever) {
        this.lever = lever;
    }

    public final void handleMessage(IWomen women) {
        if (women.getType() == this.lever) {
            this.response(women);
        } else {
            //有后续请求,才把请求往后递送
            if (this.nextHandler != null) {
                this.nextHandler.handleMessage(women);
            } else {
                //后续没人处理了
                System.out.println("已经没人处理,按不同意");
            }
        }
    }

    public void setNextHandler(Handle handler) {
        this.nextHandler = handler;
    }

    /**
     * @param women
     */
    protected abstract void response(IWomen women);
}
