package com.rh.factory.simplefactorymode.main;

import com.rh.factory.simplefactorymode.factory.ShapeFactory;
import com.rh.factory.simplefactorymode.inteface.Shape;



public class FactoryMain {
    public static void main(String[] args) {
        try {
            Shape circle = ShapeFactory.createShape("cicle");
            circle.draw();
            circle.erase();

            Shape square = ShapeFactory.createShape("square");
            square.draw();
            square.erase();

            Shape triangle = ShapeFactory.createShape("triangle");
            triangle.draw();
            triangle.erase();

            Shape unsupport = ShapeFactory.createShape("rectangle");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
