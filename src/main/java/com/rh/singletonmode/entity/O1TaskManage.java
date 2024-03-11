package com.rh.singletonmode.entity;

/**
 * 单例模式:
 * 问题:在多线程环境下，第一个线程进入getInstance中，判断tm==null，为真，执行tm = new TaskManage()进入实例化(当实例的内容过多，时间过长的时候)，
 * 第二个线程进入getInstance中，判断tm==null，也是为真，执行tm = new TaskManage()进入实例化，将再次执行，导致最终创建了多个instance对象，这违背了单例模式的初衷。
 * 如何解决： 使用饿汉单例模式和懒汉单例模式
 *
 */
public class O1TaskManage {
    //私有的静态成员变量，只存储唯一实例
    private static O1TaskManage tm = null;

    //构造方法修饰符改为private不能通过new 创建对象
    private O1TaskManage(){

    }

    public void display(){
        System.out.println("单例模式：调用获取的对象的的方法");
    }

    //它是一个静态方法，在类外可以直接通过类名来访问，而无须创建TaskManager对象
    public static O1TaskManage getInstance(){
        if (tm == null){
            tm = new O1TaskManage();
        }
        return tm;
    }


}
