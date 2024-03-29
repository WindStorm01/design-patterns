package com.rh.chain.service;

import com.rh.chain.inteface.Handle;

/**
 * 具体处理者：经理
 */
public class Manager extends Handle {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void approveRequest(int day) {
        if (  day >= 3 && day < 10){
            System.out.println("审批请假时间: " + day);
        }else {
            this.successor.approveRequest(day);
        }
    }
}
