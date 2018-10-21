package com.javaman.obsever;

/**
 * @author pengzhe
 * @date 2018/10/21 14:48
 * @description
 */

public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Obsever obsever = new ConcreteObsever();
        concreteSubject.addObsever(obsever);
        concreteSubject.doSomething();

    }
}
