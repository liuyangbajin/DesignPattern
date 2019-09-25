package com.bj.bs.factory_method;

import com.bj.bs.factory_static_method.Car;

/**
 * 奥迪
 * */
public class Audi extends Car{

    String mChair;
    String mColor;
    int type;

    public Audi(String mChair, String mColor, int type) {

        this.mChair = mChair;
        this.mColor = mColor;
        this.type = type;
    }

    /**
     * 驾驶
     * */
    public void doCreate(){

        String typeCar = type == 1 ? "轿车" : "跑车";
        System.out.println("造了一辆" + typeCar + "，它的颜色是："+ mColor +"，座椅的材料是：" + mChair);
    }
}
