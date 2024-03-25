package com.rh.compositemode.entity;

import com.rh.compositemode.inteface.Componet;

import java.util.ArrayList;
import java.util.List;

//容器构件：容器控件
public class Container extends Componet {

    private String name;

    private List<Componet> lists = new ArrayList<Componet>();

    public Container(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getList() {
        return lists;
    }

    public void setList(List list) {
        this.lists = list;
    }

    @Override
    public void add(Componet componet) {
        lists.add(componet);
    }

    @Override
    public void remove(Componet componet) {
        lists.remove(componet);
    }

    @Override
    public Componet getChild(int i) {
       return this.getChild(i);
    }

    @Override
    public void display() {

        for (Componet component : this.lists) {
             component.display();
        }

    }
}
