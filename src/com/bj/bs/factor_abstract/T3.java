package com.bj.bs.factor_abstract;

public class T3 {

    public static void main(String[] args) {

        Factory f1 = new AudiFactory();
        Car car1 = f1.getCar();
        Insurance mInsurance = f1.sellInsurance();
        Parts mParts = f1.sellParts();

        System.out.println("----------------");
        Factory f2 = new BMWFactory();
        Car car2 = f1.getCar();
        Insurance mInsurance2 = f1.sellInsurance();
        Parts mParts2 = f1.sellParts();
    }
}
