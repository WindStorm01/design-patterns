package com.rh.factory.simplefactorymode.factory;

import com.rh.factory.simplefactorymode.entity.Circle;
import com.rh.factory.simplefactorymode.entity.Square;
import com.rh.factory.simplefactorymode.entity.Triangle;
import com.rh.factory.simplefactorymode.inteface.Shape;

/**
 * 简单工厂模式(静态工厂模式):
 * （1）Factory（工厂角色）：即工厂类，它是简单工厂模式的核心，负责实现创建所有产品实例的内部逻辑。工厂类可以被外界直接调用，创建所需的产品对象。
 * 在工厂类中提供了静态的工厂方法factoryMethod（），它的返回类型为抽象产品类型Product。
 * （2）Product（抽象产品角色）：它是工厂类所创建的所有对象的父类，封装了各种产品对象的公有方法。
 * 抽象产品的引入将提高系统的灵活性，使得在工厂类中只需定义一个通用的工厂方法，因为所有创建的具体产品对象都是其子类对象。
 * （3）ConcreteProduct（具体产品角色）：它是简单工厂模式的创建目标，所有被创建的对象都充当这个角色的某个具体类的实例。
 * 每个具体产品角色都继承了抽象产品角色，需要实现在抽象产品中声明的抽象方法。
 * 缺点：
 * 当系统中需要引入新产品时，由于静态工厂方法通过所传入参数的不同来创建不同的产品，这必定要修改工厂类的源代码，将违背开闭原则
 */
public class ShapeFactory {
    public static Shape createShape(String type) throws UnSupportedShapeException {

        if (type.equalsIgnoreCase("cicle")){
            return  new Circle();
        }else if (type.equalsIgnoreCase("square")){
            return  new Square();
        }else if (type.equalsIgnoreCase("triangle")){
            return  new Triangle();
        }else {
            throw new UnSupportedShapeException("不支持的图形: UnSupportedShapeException");
        }
    }

    static class UnSupportedShapeException extends Exception {
        public UnSupportedShapeException(String message) {
            super(message);
        }
    }
}
