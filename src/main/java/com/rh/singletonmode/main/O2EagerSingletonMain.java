package com.rh.singletonmode.main;

import com.rh.singletonmode.entity.O2EagerSingleton;

public class O2EagerSingletonMain {

    public static void main(String[] args) {
        //EagerSingleton eagerSingleton = new EagerSingleton(); //饿汉单例模式内部是私有的构造方法，不允许类通过new创建实例
        O2EagerSingleton instance = O2EagerSingleton.getInstance();
        O2EagerSingleton instance1 = O2EagerSingleton.getInstance();
        if (instance1 == instance){
            System.out.println("饿汉单例模式：实例具有唯一性");
        }
    }

}
