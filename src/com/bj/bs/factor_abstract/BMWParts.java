package com.bj.bs.factor_abstract;

/**
 * 宝马配件
 * */
public class BMWParts extends Parts{

    @Override
    public void doCreateParts() {

        System.out.println("生产了宝马专用轮胎2个，备用大灯1对，备用倒车镜1个");
    }
}
