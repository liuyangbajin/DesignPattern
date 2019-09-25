package com.bj.bs.factory_static_method;

/**
 * 简单工厂模式
 * */
public class T1 {

    public static void main(String[] args) {

        Car car1 = CarFactory.getCarByNumber(1);

        Car car2 = CarFactory.getCarByNumber(3);

        Car car3 = CarFactory.getCarByNumber(4);
    }
}
