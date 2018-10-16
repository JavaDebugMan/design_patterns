package com.design.factory.method.common;

/**
 * 具体工厂类
 *
 * @author pengzhe
 * @date 2018/10/16 19:28
 */
public class ConcreteCreator extends Creator {

    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            //异常处理
        }
        return (T) product;
    }
}
