package com.rh.singletonmode.entity;

/**
 * 懒汉单例模式：第一次调用getInstance（）方法时实例化，在类加载时并不自行实例化，这种技术又称为延迟加载（Lazy Load）技术，即需要的时候再加载实例
 */
public class O3LazySingleton {

    //使用双重锁定
    private volatile static O3LazySingleton singleton =  null;
    //private static LazySingleton singleton =  null;

    private O3LazySingleton(){

    }

    /*//增加了关键字synchronized进行线程锁定，以处理多个线程同时访问的问题,在多线程高并发访问环境中，将会导致系统性能大大降低
    synchronized public static LazySingleton getInstance(){
        if (singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }*/

    /**
     * 无须对整个getInstance()方法进行锁定，只需锁定代码“singleton = new LazySingleton();”
     * 问题：
     * 一瞬间线程A和B同时调用getInstance(),此时instance对象为null值，均能通过“instance＝＝null”的判断，
     * 线程A进入synchronized锁定的代码中执行实例创建代码，线程B处于排队等待状态，必须等待线程A执行完毕后才可以进入synchronized锁定代码。
     * 线程A执行完成后，创建实例,线程B进入后，并不知道已经存在实例，继续新创建实例，导致出现多个实例对象，违背单例原则
     * 解决：
     * 在synchronized锁定代码中再进行一次“instance＝＝null”判断，这种方式称为双重检查锁定（Double-Check Locking）。
     */
    /*public static LazySingleton getInstance(){
        if (singleton == null){
            synchronized (LazySingleton.class){
                singleton = new LazySingleton();
            }
        }
        return singleton;
    }*/

    /**
     * 双重检查锁定（Double-Check Locking）:
     * 使用双重检查锁定来实现懒汉式单例类，需要在静态成员变量instance之前增加修饰符volatile，被volatile修饰的成员变量可以确保多个线程都能够正确处理.
     * 问题:由于volatile关键字会屏蔽Java虚拟机所做的一些代码优化，可能会导致系统运行效率降低
     */

    public static O3LazySingleton getInstance(){
        if (singleton == null){
            synchronized (O3LazySingleton.class){
                if (singleton == null){
                    singleton = new O3LazySingleton();
                }
            }
        }
        return singleton;
    }

}
