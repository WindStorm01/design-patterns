package com.rh.compositemode.inteface;

//抽象构件：界面控件
public abstract class Componet {

    public abstract void add(Componet componet);

    public abstract void remove(Componet componet);

    public abstract Componet getChild(int i);

    public abstract void display();


}
