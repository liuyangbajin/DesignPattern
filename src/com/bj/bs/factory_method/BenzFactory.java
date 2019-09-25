package com.bj.bs.factory_method;

import com.bj.bs.factory_static_method.Benz;
import com.bj.bs.factory_static_method.Car;

/**
 * 奔驰工厂，只生产奔驰
 * */
public class BenzFactory extends CarFactory{

    @Override
    public Car getCar() {

        Car car3 = new Benz("木质");
        car3.doCreate();
        return car3;
    }
}
