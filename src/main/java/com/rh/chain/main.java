package com.rh.chain;

import com.rh.chain.inteface.Handle;
import com.rh.chain.service.Director;
import com.rh.chain.service.Manager;
import com.rh.chain.service.President;

/**
 * 请求的链式处理：责任链模式
 *
 * （1）Handler（抽象处理者）：它定义了一个处理请求的接口，一般设计为抽象类。由于不同的具体处理者处理请求的方式不同，因此在其中定义了抽象请求处理方法。
 * 因为每个处理者的下家还是一个处理者，因此在抽象处理者中定义了一个抽象处理者类型的对象（结构图中的successor），作为其对下家的引用。通过该引用，处理者可以连成一条链。
 * （2）ConcreteHandler（具体处理者）：它是抽象处理者的子类，可以处理用户请求。
 * 在具体处理者类中实现了抽象处理者中定义的抽象请求处理方法，在处理请求之前需要进行判断，看是否有相应的处理权限，如果可以处理请求就处理它，否则将请求转发给后继者。
 * 在具体处理者中可以访问链中下一个对象，以便请求的转发。
 *
 * 需求：
 * Sunny软件公司的OA系统需要提供一个假条审批模块：
 * 如果员工请假天数小于3天，主任可以审批该假条；
 * 如果员工请假天数大于或等于3天，小于10天，经理可以审批；
 * 如果员工请假天数大于或等于10天，小于30天，总经理可以审批；
 * 如果超过30天，总经理也不能审批，提示相应的拒绝信息。试用职责链模式设计该假条审批模块。
 */
public class main {

    public static void main(String[] args) {
        Integer day = 3;
        Handle director,manager,president;
        director = new Director("主任");
        manager = new Manager("经理");
        president =  new President("总经理");

        //创建责任链
        director.setSuccessor(manager);
        manager.setSuccessor(president);

        director.approveRequest(1);
        director.approveRequest(3);
        director.approveRequest(10);
        director.approveRequest(30);

    }
}
