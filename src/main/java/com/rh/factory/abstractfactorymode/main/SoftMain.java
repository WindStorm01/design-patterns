package com.rh.factory.abstractfactorymode.main;

import com.rh.factory.abstractfactorymode.factory.AndroidFactory;
import com.rh.factory.abstractfactorymode.factory.IOSFactory;
import com.rh.factory.abstractfactorymode.factory.SoftFactory;
import com.rh.factory.abstractfactorymode.inteface.InterfaceHandle;
import com.rh.factory.abstractfactorymode.inteface.OperationHandle;

/**
 * 实例：
 * Sunny软件公司欲推出一款新的手机游戏软件，该软件能够支持iOS和Android等多个智能手机操作系统平台。
 * 针对不同的手机操作系统，该游戏软件提供了不同的游戏操作控制（OperationController）类和游戏界面控制（InterfaceController）类，并提供相应的工厂类来封装这些类的初始化过程。
 * 该软件要求具有较好的扩展性以支持新的操作系统平台，为了满足上述需求，试采用抽象工厂模式对其进行设计。
 *
 * 产品族：ios中的操作控制和游戏界面控制为一个产品族（Android同理）
 * 产品等级：ios和Android中的操作系统为一个产品等级，界面控制为另一个产品等级。
 *
 * 抽象工厂模式：
 * （1）AbstractFactory（抽象工厂）：它声明了一组用于创建一族产品的方法，每个方法对应一种产品。
 * （2）ConcreteFactory（具体工厂）：它实现了在抽象工厂中声明的创建产品的方法，生成一组具体产品，这些产品构成了一个产品族，每种产品都位于某个产品等级结构中。
 * （3）AbstractProduct（抽象产品）：它为每种产品声明接口，在抽象产品中声明了产品所具有的业务方法。
 * （4）ConcreteProduct（具体产品）：它定义具体工厂生产的具体产品对象，实现在抽象产品接口中声明的业务方法。
 *
 * 缺点：
 * 增加新的产品等级结构麻烦，需要对原有系统进行较大的修改，甚至需要修改抽象层代码，这显然会带来较大的不便，违背了开闭原则。
 */
public class SoftMain {
    public static void main(String[] args) {
        SoftFactory factory;
        InterfaceHandle interfaceHandle;
        OperationHandle operationHandle;

        //安卓
        factory = new AndroidFactory();
        interfaceHandle = factory.createInterfaceHandle();
        interfaceHandle.interfaceController();
        operationHandle = factory.createOperationHandle();
        operationHandle.OperationController();

        //ios
        factory = new IOSFactory();
        interfaceHandle = factory.createInterfaceHandle();
        interfaceHandle.interfaceController();
        operationHandle = factory.createOperationHandle();
        operationHandle.OperationController();


    }
}
