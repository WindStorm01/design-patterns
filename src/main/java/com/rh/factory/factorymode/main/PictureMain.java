package com.rh.factory.factorymode.main;

import com.rh.factory.factorymode.factory.GifFactory;
import com.rh.factory.factorymode.factory.JpgFactory;
import com.rh.factory.factorymode.factory.PictrueFactory;
import com.rh.factory.factorymode.inteface.Picture;

/**
 * 多态工厂模式:
 * （1）在工厂方法模式中，工厂方法用来创建客户所需要的产品，同时还向客户隐藏了哪种具体产品类将被实例化这一细节。
 * 用户只需要关心所需产品对应的工厂，无须关心创建细节，甚至无须知道具体产品类的类名。
 * （2）基于工厂角色和产品角色的多态性设计是工厂方法模式的关键。
 * 它能够让工厂可以自主确定创建何种产品对象，而如何创建这个对象的细节则完全封装在具体工厂内部。工厂方法模式之所以又被称为多态工厂模式，
 * 正是因为所有的具体工厂类都具有同一抽象父类。
 * （3）使用工厂方法模式的另一个优点是在系统中加入新产品时，
 * 无须修改抽象工厂和抽象产品提供的接口，无须修改客户端，也无须修改其他的具体工厂和具体产品，而只要添加一个具体工厂和具体产品就可以了。
 * 这样，系统的可扩展性也就变得非常好，完全符合开闭原则。
 * 缺点:
 * （1）在添加新产品时，需要编写新的具体产品类，而且还要提供与之对应的具体工厂类，
 * 系统中类的个数将成对增加，在一定程度上增加了系统的复杂度，有更多的类需要编译和运行，会给系统带来一些额外的开销。
 * （2）由于考虑到系统的可扩展性，需要引入抽象层，在客户端代码中均使用抽象层进行定义，增加了系统的抽象性和理解难度，
 * 且在实现时可能需要用到DOM、反射等技术，增加了系统的实现难度。
 *
 * （1）Product（抽象产品）：它是定义产品的接口，是工厂方法模式所创建对象的超类型，也就是产品对象的公共父类。
 * （2）ConcreteProduct（具体产品）：它实现了抽象产品接口，某种类型的具体产品由专门的具体工厂创建，具体工厂和具体产品之间一一对应。
 * （3）Factory（抽象工厂）：在抽象工厂类中，声明了工厂方法（Factory Method），用于返回一个产品。抽象工厂是工厂方法模式的核心，所有创建对象的工厂类都必须实现该接口。
 * （4）ConcreteFactory（具体工厂）：它是抽象工厂类的子类，实现了抽象工厂中定义的工厂方法，并可由客户端调用，返回一个具体产品类的实例。
 *
 */
public class PictureMain {
    public static void main(String[] args) {
        PictrueFactory pictrueFactory;
        Picture picture;
        pictrueFactory = new JpgFactory();
        picture = pictrueFactory.createPicture();
        picture.read();

        pictrueFactory = new GifFactory();
        picture = pictrueFactory.createPicture();
        picture.read();
    }
}
