package com.rh.singletonmode.entity;

/**
 * 恶汉单例模式:由于在定义静态变量的时候实例化单例类，因此在类加载时就已经创建了单例对象
 */
public class O2EagerSingleton {

    private static O2EagerSingleton eagerSingleton =  new O2EagerSingleton();

    //私有的构造方法，不允许类通过new创建实例
    private O2EagerSingleton(){

    }

    public static O2EagerSingleton getInstance(){
        return  eagerSingleton;
    }

}
