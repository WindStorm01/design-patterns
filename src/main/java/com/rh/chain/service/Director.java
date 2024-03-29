package com.rh.chain.service;

import com.rh.chain.inteface.Handle;

/**
 * 具体处理者：主任
 */
public class Director extends Handle {

    public Director(String name) {
        super(name);
    }

    @Override
    public void approveRequest(int day) {
        if (day < 3){
            System.out.println("审批请假时间: " + day);
        }else {
            this.successor.approveRequest(day);
        }
    }
}
