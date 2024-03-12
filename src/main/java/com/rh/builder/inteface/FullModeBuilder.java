package com.rh.builder.inteface;

import com.rh.builder.entity.*;

/**
 * 主页面完整模式：具体建造者（ConcreteBuilder）
 */
public class FullModeBuilder extends MainBuilder{

    @Override
    public void buildMainWindow() {
        super.getMainInterface().setMainWindow(new MainWindow("Full Mode Main Window"));
    }

    @Override
    public void buildControllerBar() {
        super.getMainInterface().setControllerBar(new ControllerBar("Full mode controller bar"));
    }

    @Override
    public void buildMenu() {
        super.getMainInterface().setMenu(new Menu("Full mode menu"));
    }

    @Override
    public void buildPlayList() {
        super.getMainInterface().setPlayList(new PlayList("Full mode play list"));
    }

    @Override
    public void buildFavoriteList() {
        super.getMainInterface().setFavoriteList(new FavoriteList("Full mode favorite list"));
    }
}
