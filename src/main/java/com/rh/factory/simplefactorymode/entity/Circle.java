package com.rh.factory.simplefactorymode.entity;

import com.rh.factory.simplefactorymode.inteface.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("画圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除圆形");
    }
}
