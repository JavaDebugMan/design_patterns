package com.javaman.chain.use;

import com.javaman.chain.example.IWomen;

/**
 * @author pengzhe
 * @date 2018/11/7 14:24
 */
public class Women implements IWomen {

    private int type = 0;
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是:" + request;
                break;
            case 2:
                this.request = "妻子的请求是:" + request;
                break;
            case 3:
                this.request = "母亲的请求是:" + request;
                break;
            default:
                break;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
