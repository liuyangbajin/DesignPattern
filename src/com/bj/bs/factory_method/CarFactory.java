package com.bj.bs.factory_method;

import com.bj.bs.factory_static_method.Car;

/**
 * 抽象的工厂类
 * */
public abstract class CarFactory {

    // 根据单号生产汽车
    public abstract Car getCar();
}