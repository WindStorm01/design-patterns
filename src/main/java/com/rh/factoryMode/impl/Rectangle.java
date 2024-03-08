package com.rh.factoryMode.impl;

import com.rh.factoryMode.interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
