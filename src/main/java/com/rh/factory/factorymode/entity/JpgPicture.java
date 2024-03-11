package com.rh.factory.factorymode.entity;

import com.rh.factory.factorymode.inteface.Picture;

/**
 * （2）ConcreteProduct（具体产品）：它实现了抽象产品接口，某种类型的具体产品由专门的具体工厂创建，具体工厂和具体产品之间一一对应。
 */
public class JpgPicture implements Picture {

    @Override
    public void read() {
        System.out.println("读取jpf");
    }
}
