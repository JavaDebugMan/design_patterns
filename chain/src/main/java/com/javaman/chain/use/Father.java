package com.javaman.chain.use;

import com.javaman.chain.example.IWomen;

/**
 * @author pengzhe
 * @date 2018/11/7 14:18
 */
public class Father extends Handle {

    public Father() {
        super(Handle.FATHER_LEVER_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("-------女儿向父亲请示--------:");
        System.out.println(women.getRequest());
        System.out.println("父亲表示同意");
    }
}
