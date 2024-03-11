package com.rh.singletonmode.main;

import com.rh.singletonmode.entity.O3LazySingleton;

public class O3LazySingletonMain {

    public static void main(String[] args) {
        //LazySingleton lazySingletonMain = new LazySingleton(); //单例模式:构造方法都为private ,禁止new实例
        O3LazySingleton instance = O3LazySingleton.getInstance();
        O3LazySingleton instance1 = O3LazySingleton.getInstance();
        if (instance == instance1){
            System.out.println("懒汉单例模式：实例具有唯一性");
        }
    }
}
