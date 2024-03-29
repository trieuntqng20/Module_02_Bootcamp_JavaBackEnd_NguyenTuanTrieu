package com.trieunt.bai3;

public class Point2D {
    private float x;
    private float y;
    private float[] xy = new float[2];

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXy(float x, float y) {
        this.xy[0] = x;
        this.xy[1] = y;
    }

    public float[] getXy() {
        return xy;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}
