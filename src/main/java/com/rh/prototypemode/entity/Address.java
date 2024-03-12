package com.rh.prototypemode.entity;

public class Address implements Cloneable {
    private String name;
    private String postCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
