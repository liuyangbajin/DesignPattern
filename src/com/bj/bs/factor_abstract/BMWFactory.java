package com.bj.bs.factor_abstract;

/**
 * 宝马工厂
 * */
public class BMWFactory extends Factory{

    @Override
    public Car getCar() {

        // 生产汽车
        Car car = new BMW("真皮", "黑色");
        car.doCreate();
        return car;
    }

    @Override
    public Parts sellParts() {

        // 生产配件
        Parts mParts = new BMWParts();
        mParts.doCreateParts();
        return mParts;
    }

    @Override
    public Insurance sellInsurance() {

        // 出售保险
        Insurance mInsurance = new BMWInsurance();
        mInsurance.sellInsurance();
        return mInsurance;
    }
}
