package com.rh.chain.service;

import com.rh.chain.inteface.Handle;

/**
 * 具体处理者：总经理
 */
public class President extends Handle {
    public President(String name) {
        super(name);
    }

    @Override
    public void approveRequest(int day) {
        if (  day >= 10 && day < 30){
            System.out.println("审批请假时间: " + day);
        }else {
            System.out.println("请假天数：" + day);
        }
    }
}
