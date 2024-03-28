package com.rh.proxy.inteface;

public class Validator {
    public boolean validate(String userId){
        System.out.println("验证用户：" + userId + " 是否是非法用户");
        if (userId.equalsIgnoreCase("rh")){
            System.out.println(userId + "：登录成功");
            return true;
        }
        System.out.println(userId + "：登录失败");
        return false;
    }

}
