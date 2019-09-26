package com.bj.bs.factory_method;

/**
 * 工厂方法模式
 * */
public class T2 {

    public static void main(String[] args) {

        CarFactory mAudiFactory = new AudiFactory();
        mAudiFactory.getCar();

        CarFactory mBMWFactory = new BMWFactory();
        mBMWFactory.getCar();
    }
}
