package com.rh.prototypemode.main;

import com.rh.prototypemode.entity.Address;
import com.rh.prototypemode.entity.Customer;

/**
 * 原型模式：
 * （1）Prototype（抽象原型类）：它是声明克隆方法的接口，是所有具体原型类的公共父类，可以是抽象类也可以是接口，甚至还可以是具体实现类。
 * （2）ConcretePrototype（具体原型类）：它实现在抽象原型类中声明的克隆方法，在克隆方法中返回自己的一个克隆对象。
 * （3）Client（客户类）：让一个原型对象克隆自身从而创建一个新的对象，在客户类中只需要直接实例化或通过工厂方法等方式创建一个原型对象，再通过调用该对象的克隆方法即可得到多个相同的对象。
 * 由于客户类针对抽象原型类Prototype编程，因此用户可以根据需要选择具体原型类，系统具有较好的可扩展性，增加或更换具体原型类都很方便。
 */
public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address();
        address.setName("aa");
        address.setPostCode("p1");
        Object clone1 = address.clone();
        System.out.println("是否同一个实例："+address == clone1);

        Customer customer = new Customer();
        customer.setId("11");
        customer.setAddress(address);
        System.out.println("id："+customer.getId());
        System.out.println("address.name："+customer.getAddress().getName());
        System.out.println("address.postCode："+customer.getAddress().getPostCode());

        Object clone = customer.clone();
        System.out.println("是否同一个实例：" + customer == clone);

    }
}
