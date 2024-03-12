package com.rh.builder.main;

import com.rh.builder.entity.MainInterface;
import com.rh.builder.inteface.FullModeBuilder;
import com.rh.builder.inteface.SimpleModeBuilder;

/**
 * 建造者模式：
 * （1）Builder（抽象建造者）：它为创建一个产品Product对象的各个部件指定抽象接口。
 * 在该接口中一般声明两类方法：一类方法是buildPartX（），用于创建复杂对象的各个部件；另一类方法是getResult（），用于返回复杂对象。Builder既可以是抽象类，也可以是接口。
 * （2）ConcreteBuilder（具体建造者）：它实现了Builder接口，实现各个部件的具体构造和装配方法，定义并明确其所创建的复杂对象，也可以提供一个方法返回创建好的复杂产品对象。
 * （3）Product（产品角色）：它是被构建的复杂对象，包含多个组成部件。具体建造者创建该产品的内部表示并定义其装配过程。
 * （4）Director（指挥者）：指挥者又称为导演类，它负责安排复杂对象的建造次序。
 * 指挥者与抽象建造者之间存在关联关系，可以在其construct（）建造方法中调用建造者对象的部件构造与装配方法，完成复杂对象的建造。
 * 客户端一般只需要与指挥者进行交互，在客户端确定具体建造者的类型，并实例化具体建造者对象（也可以通过配置文件和反射机制），然后通过指挥者类的构造函数或者Setter方法将该对象传入指挥者类中。
 */
public class BuilderMain {
    public static void main(String[] args) {
        FullModeBuilder fullModeBuilder = new FullModeBuilder();
        MainDirector mainDirector = new MainDirector();
        MainInterface mainInterface = mainDirector.construct(fullModeBuilder);
        System.out.println(mainInterface.getMainWindow().getName());
        System.out.println(mainInterface.getControllerBar().getType());
        System.out.println(mainInterface.getMenu().getType());
        System.out.println(mainInterface.getFavoriteList().getType());
        System.out.println(mainInterface.getPlayList().getType());

        SimpleModeBuilder simpleModeBuilder = new SimpleModeBuilder();
        mainInterface = mainDirector.construct(simpleModeBuilder);
        System.out.println(mainInterface.getMainWindow().getName());
        System.out.println(mainInterface.getControllerBar().getType());

    }
}
