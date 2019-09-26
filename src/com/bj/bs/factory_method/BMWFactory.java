package com.bj.bs.factory_method;


/**
 * 宝马工厂，只生产宝马
 * */
public class BMWFactory extends CarFactory{

    @Override
    public Car getCar() {

        Car car2 = new BMW("木质", "绿色");
        car2.doCreate();
        return car2;
    }
}
