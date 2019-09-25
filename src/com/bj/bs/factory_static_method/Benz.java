package com.bj.bs.factory_static_method;

/**
 * 奔驰
 * */
public class Benz extends Car{

    String mChair;

    public Benz(String mChair) {

        this.mChair = mChair;
    }

    /**
     * 驾驶
     * */
    public void doCreate(){

        System.out.println("造了一辆车，它的颜色是：默认黑色，座椅的材料是：" + mChair);
    }
}
