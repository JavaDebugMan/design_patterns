package com.javaman.chain.use;

import com.javaman.chain.example.IWomen;

/**
 * @author pengzhe
 * @date 2018/11/7 14:21
 */
public class Husband extends Handle {

    public Husband() {
        super(Handle.HUSBAND_LEVER_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("-------妻子向丈夫请示--------:");
        System.out.println(women.getRequest());
        System.out.println("丈夫表示同意");
    }
}
