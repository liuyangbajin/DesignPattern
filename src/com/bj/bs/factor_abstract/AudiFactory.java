package com.bj.bs.factor_abstract;

public class AudiFactory extends Factory{

    @Override
    public Car getCar() {

        // 生产汽车
        Car car = new Audi("真皮");
        car.doCreate();
        return car;
    }

    @Override
    public Parts sellParts() {

        // 生产配件
        Parts mParts = new AudiParts();
        mParts.doCreateParts();
        return mParts;
    }

    @Override
    public Insurance sellInsurance() {

        // 出售保险
        Insurance mInsurance = new AudiInsurance();
        mInsurance.sellInsurance();
        return mInsurance;
    }
}
