package com.rh.compositemode.entity;

import com.rh.compositemode.inteface.Componet;

//叶子构件：按钮
public class Button extends Componet {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Button(String name) {
        this.name = name;
    }

    @Override
    public void add(Componet componet) {

    }

    @Override
    public void remove(Componet componet) {

    }

    @Override
    public Componet getChild(int i) {
        return null;
    }

    @Override
    public void display() {
        System.out.println("按钮展示：" + name);
    }
}
