package com.bj.bs.factor_abstract;

/**
 * 奥迪配件
 * */
public class AudiParts extends Parts {

    @Override
    public void doCreateParts() {

        System.out.println("生产了奥迪专用轮胎2个，备用大灯1对");
    }
}
