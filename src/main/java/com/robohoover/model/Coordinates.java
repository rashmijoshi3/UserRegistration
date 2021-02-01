package com.robohoover.model;

public class Coordinates {

    private Integer x;
    private Integer y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y  = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
