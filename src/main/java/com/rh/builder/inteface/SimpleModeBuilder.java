package com.rh.builder.inteface;

import com.rh.builder.entity.ControllerBar;
import com.rh.builder.entity.MainWindow;

/**
 * 主页面完整模式：具体建造者（ConcreteBuilder）
 */
public class SimpleModeBuilder extends MainBuilder{
    @Override
    public void buildMainWindow() {
        super.getMainInterface().setMainWindow(new MainWindow("simple mode main window"));
    }

    @Override
    public void buildControllerBar() {
        super.getMainInterface().setControllerBar(new ControllerBar("simple mode controller bar"));
    }

    @Override
    public void buildMenu() {

    }

    @Override
    public void buildPlayList() {

    }

    @Override
    public void buildFavoriteList() {

    }
}
