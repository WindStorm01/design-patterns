package com.rh.singletonmode.main;

import com.rh.singletonmode.entity.O4IoDHSingleton;

public class O4IoDHSingletonMain {

    public static void main(String[] args) {
        O4IoDHSingleton instance = O4IoDHSingleton.getInstance();
        O4IoDHSingleton instance1 = O4IoDHSingleton.getInstance();
        if (instance == instance1){
            System.out.println("IoDH单例模式：实例具有唯一性");
        }
    }
}
