package com.javaman.chain.use;

import com.javaman.chain.example.IWomen;

/**
 * @author pengzhe
 * @date 2018/11/7 14:22
 */
public class Son extends Handle {

    public Son() {
        super(Handle.SON_LEVER_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("-------母亲向儿子请示--------:");
        System.out.println(women.getRequest());
        System.out.println("儿子表示同意");
    }
}
