package com.bj.bs.factory_method;


/**
 * 奥迪工厂，只生产奥迪
 * */
public class AudiFactory extends CarFactory{

    @Override
    public Car getCar() {

        Car car = new Audi("真皮");
        car.doCreate();
        return car;
    }
}
