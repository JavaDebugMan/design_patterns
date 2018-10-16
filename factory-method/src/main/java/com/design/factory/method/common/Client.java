package com.design.factory.method.common;

/**
 * @author pengzhe
 * @date 2018/10/16 19:29
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /*
         * 继续业务处理
         */
    }
}
