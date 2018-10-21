package com.javaman.obsever;

/**
 * @author pengzhe
 * @date 2018/10/21 14:45
 * @description
 */

public class ConcreteSubject extends Subject {

    public void doSomething() {
        super.notifyObsevers();
    }
}
