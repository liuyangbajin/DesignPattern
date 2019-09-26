package com.bj.bs.factory_method;

/**
 * 抽象的工厂类
 * */
public abstract class CarFactory {

    // 根据单号生产汽车
    public abstract Car getCar();
}