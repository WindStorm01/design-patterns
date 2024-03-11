package com.rh.singletonmode.main;

import com.rh.singletonmode.entity.O1TaskManage;

/**
 * 单例模式（Singleton Pattern）：确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例，这个类称为单例类，它提供全局访问的方法。
 * 单例模式是一种对象创建型模式。
 * 单例模式有3个要点：①某个类只能有一个实例；
 * ②它必须自行创建这个实例；
 * ③它必须自行向整个系统提供这个实例。
 */

public class O1SingleMode {

    public static void main(String[] args) {
        /*TaskManage taskManage = new TaskManage(); //构造方法修饰符为prvate.不能通过外部new 进行实例化*/
        O1TaskManage instance1 = O1TaskManage.getInstance();
        O1TaskManage instance2 = O1TaskManage.getInstance();
        O1TaskManage instance3 = O1TaskManage.getInstance();
        O1TaskManage instance4 = O1TaskManage.getInstance();
        if(instance1 == instance2 && instance2 == instance3 && instance3 == instance4 ){
            System.out.println("实例具有唯一性");
        }
    }
}
