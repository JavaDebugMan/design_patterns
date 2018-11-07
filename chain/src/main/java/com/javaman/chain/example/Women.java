package com.javaman.chain.example;

/**
 * @author pengzhe
 * @date 2018/11/7 13:47
 */
public class Women implements IWomen {
    /**
     * 1:未婚
     * 2:已婚未丧偶
     * 3:丧偶
     */
    private int type = 0;
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
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
