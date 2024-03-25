package com.rh.compositemode.entity;

import com.rh.compositemode.inteface.Componet;

//叶子构件：文本框
public class TextBox extends Componet {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TextBox(String name){
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
        System.out.println("文本框展示：" + name);

    }
}
