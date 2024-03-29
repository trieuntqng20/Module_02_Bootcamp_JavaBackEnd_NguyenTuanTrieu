package com.trieunt.bai2;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return this.height * this.getArea();
    }

    @Override
    public String toString() {
        return super.toString() + " and height = " + this.height;
    }
}
