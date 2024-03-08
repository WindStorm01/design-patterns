package com.rh.factoryMode.impl;

import com.rh.factoryMode.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
