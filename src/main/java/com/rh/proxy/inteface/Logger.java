package com.rh.proxy.inteface;

public class Logger {
    public void log(String userId){
        System.out.println("更新数据库,用户：" + userId + "查询加1次");

    }
}
