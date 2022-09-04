package com.designpattern.art.strategy.pattern;

public class Client {
    public static void main(String[] args) {
        Plane helicopter, airPlane;
        AbstractStartFlyStrategy startFlyStrategy;
        AbstractNormalFlyStrategy normalFlyStrategy;

        helicopter = new Plane("直升机");
        airPlane = new Plane("客机");
        startFlyStrategy = new VerticalStartFlyStrategy();
        normalFlyStrategy = new SubSonicNormalFlyStrategy();

        helicopter.setStartFlyStrategy(startFlyStrategy);
        helicopter.setNormalFlyStrategy(normalFlyStrategy);
        helicopter.takeOff();
        helicopter.fly();

        System.out.println();

        startFlyStrategy = new LongDisStartFlyStrategy();
        airPlane.setStartFlyStrategy(startFlyStrategy);
        airPlane.setNormalFlyStrategy(normalFlyStrategy);
        airPlane.takeOff();
        airPlane.fly();
    }
}
