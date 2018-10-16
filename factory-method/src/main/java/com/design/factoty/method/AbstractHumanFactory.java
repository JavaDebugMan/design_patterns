package com.design.factoty.method;

/**
 * @author pengzhe
 * @date 2018/10/16 19:03
 */
public abstract class AbstractHumanFactory {
    /**
     * createHuman
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public abstract <T extends Human> T createHuman(Class<T> clazz);
}
