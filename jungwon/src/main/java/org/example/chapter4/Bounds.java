package org.example.chapter4;

public class Bounds {
    double x;
    double y;
    int width;
    int height;

    public Bounds() {
    }

    public Bounds(double x, double y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void set(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public boolean contains(double x, double y) {
        if(x + y >= 10) return true;

        return false;
    }
}
