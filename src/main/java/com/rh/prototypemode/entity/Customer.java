package com.rh.prototypemode.entity;

public class Customer implements Cloneable {

    private String id;

    private Address address;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //浅克隆 只克隆基本类型数值，引用类型只复制引用地址
        Customer clonedCustomer = (Customer) super.clone();

        //深克隆 除了复制对象本身外，还会递归地复制所有引用类型成员变量所引用的对象，以确保创建了全新的对象。
        clonedCustomer.address = (Address) address.clone();

        return clonedCustomer;
    }
}
