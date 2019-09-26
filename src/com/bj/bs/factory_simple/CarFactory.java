package com.bj.bs.factory_simple;

/**
 * 工厂
 * */
public class CarFactory {

    /**
     * 根据用户下单的订单号，生产对应的汽车
     * */
    public static Car getCarByNumber(int num){

        switch (num){

            case 1: // 来一辆紫色的宝马，要真皮座椅

                Car car1 = new BMW("真皮", "紫色");
                car1.doCreate();
                return car1;

            case 2: // 来一辆绿色的宝马，要木质座椅

                Car car2 = new BMW("木质", "绿色");
                car2.doCreate();
                return car2;

            case 3: // 来一辆奥迪，要真皮座椅

                Car car4 = new Audi("真皮");
                car4.doCreate();
                return car4;

            default:

                System.out.println("暂无该车");
                return null;
        }
    }
}