package com.bj.bs.factory_method;

import com.bj.bs.factory_static_method.Audi;
import com.bj.bs.factory_static_method.Car;

/**
 * 奥迪跑车工厂，只生产奥迪
 * */
public class AudiSportsCarFactory extends CarFactory{

    @Override
    public Car getCar() {

        Car car = new Audi("真皮", "绿色",1);
        car.doCreate();
        return car;
    }
}
