package com.bj.bs.factory_simple;

/**
 * 宝马
 * */
public class BMW extends Car{

    String mChair;
    String mColor;

    public BMW(String mChair, String mColor) {

        this.mChair = mChair;
        this.mColor = mColor;
    }

    /**
     * 驾驶
     * */
    public void doCreate(){

        System.out.println("造了一辆宝马，它的颜色是："+ mColor + "，座椅的材料是：" + mChair);
    }
}
