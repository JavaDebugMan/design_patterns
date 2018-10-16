package com.design.factoty.method;

/**
 * @author pengzhe
 * @date 2018/10/16 19:06
 */
public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> clazz) {
        Human human = null;
        try {
            human = (T) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
