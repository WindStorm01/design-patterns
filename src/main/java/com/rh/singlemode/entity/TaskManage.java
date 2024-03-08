package com.rh.singlemode.entity;

public class TaskManage {
    //私有的静态成员变量，只存储唯一实例
    private static TaskManage tm = null;

    //构造方法修饰符改为private不能通过new 创建对象
    private TaskManage(){

    }

    public void display(){
        System.out.println("单例模式：调用获取的对象的的方法");
    }

    //它是一个静态方法，在类外可以直接通过类名来访问，而无须创建TaskManager对象
    public static TaskManage getInstance(){
        if (tm == null){
            tm = new TaskManage();
        }
        return tm;
    }


}
