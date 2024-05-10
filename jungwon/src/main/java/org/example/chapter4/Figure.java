package org.example.chapter4;

import java.awt.*;

public abstract class Figure {
    private Bounds bounds = new Bounds();

    private void changeSize(int x ,int y, int width ,int height){
        bounds.set(x,y,width,height);
    }

    public boolean contains(Point point){
        Bounds bounds = new Bounds(3,5,15,20);

        return bounds.contains(point.getX(),point.getY());
    }
}
