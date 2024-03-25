package com.rh.compositemode.main;

import com.rh.compositemode.entity.Button;
import com.rh.compositemode.entity.Container;
import com.rh.compositemode.entity.TextBox;
import com.rh.compositemode.inteface.Componet;

/**
 * 树型结构处理：组合模式
 * 需求： Sunny软件公司欲开发一个界面控件库。界面控件分为两大类：一类是单元控件，例如按钮、文本框等；另一类是容器控件，例如窗体、中间面板等。试用组合模式设计该界面控件库。
 *
 * （1）Component（抽象构件）：它可以是接口或抽象类，为叶子构件和容器构件对象声明接口，在该角色中可以包含所有子类共有行为的声明和实现。
 *      在抽象构件中定义了访问及管理它的子构件的方法，例如增加子构件、删除子构件、获取子构件等。
 * （2）Leaf（叶子构件）：它在组合模式结构中表示叶子节点对象。叶子节点没有子节点，它实现了在抽象构件中定义的行为。对于那些访问及管理子构件的方法，可以通过捕获异常等方式进行处理。
 * （3）Composite（容器构件）：它在组合模式结构中表示容器节点对象。容器节点包含子节点，其子节点可以是叶子节点，也可以是容器节点。它提供一个集合用于存储子节点，
 *     实现了在抽象构件中定义的行为，包括那些访问及管理子构件的方法，在其业务方法中可以递归调用其子节点的业务方法。
 */
public class CompositeMain {

    public static void main(String[] args) {
        Componet button, textBox, form, panel;

        form = new Container("窗体");

        panel = new Container("中间面板");

        button = new Button("按钮");

        textBox = new TextBox("文本框");

        panel.add(button);

        panel.add(textBox);

        form.add(panel);

        form.display();

    }
}
