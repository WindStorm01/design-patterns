package com.rh.singletonmode.entity;

/**
 * 单例模式:Initialization on Demand Holder（IoDH）的技术。
 * 由于静态单例对象没有作为Singleton的成员变量直接实例化，因此类加载时不会实例化Singleton,
 * 第一次调用getInstance（）时将加载内部类HolderClass，在该内部类中定义了一个static类型的变量instance，此时会首先初始化这个成员变量，
 * 由Java虚拟机来保证其线程安全性，确保该成员变量只能初始化一次。由于getInstance（）方法没有被任何线程锁定，因此其性能不会造成任何影响
 * 作用:
 * 既可以实现延迟加载，又可以保证线程安全，不影响系统性能。因此，IoDH不失为一种最好的Java语言单例模式实现方式；
 * 缺点:与编程语言本身的特性相关，很多面向对象语言不支持IoDH。
 */
public class O4IoDHSingleton {

    private O4IoDHSingleton(){

    }

    private static class HoldClass{
        private final static O4IoDHSingleton singleton = new O4IoDHSingleton();
    }

    public static O4IoDHSingleton getInstance(){
        return HoldClass.singleton;
    }
}
