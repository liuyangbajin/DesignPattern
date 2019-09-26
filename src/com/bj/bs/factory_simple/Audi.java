package com.bj.bs.factory_simple;

/**
 * 奥迪
 * */
public class Audi extends Car{

    String mChair;

    public Audi(String mChair) {

        this.mChair = mChair;
    }

    /**
     * 驾驶
     * */
    public void doCreate(){

        System.out.println("造了一辆奥迪，它的颜色是：默认黑色：座椅的材料是：" + mChair);
    }
}
