package com.rh.factory.simplefactorymode.entity;

import com.rh.factory.simplefactorymode.inteface.Shape;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画长方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除长方形");
    }
}
