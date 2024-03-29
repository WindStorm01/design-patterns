package com.rh.chain.inteface;

/**
 * 抽象处理者：审批者
 */
public abstract class Handle {
    private String name;

    //需要持有下一个处理者的引用
    protected Handle successor;

    public Handle(String name){
        this.name = name;
    }
    public void setSuccessor(Handle successor){
        this.successor = successor;
    }

    public abstract void approveRequest(int day);
}
