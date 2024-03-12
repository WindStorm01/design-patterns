package com.rh.builder.inteface;

import com.rh.builder.entity.MainInterface;

/**
 * 主页面建造：抽象建造者(builder)
 */
public abstract class MainBuilder {

    private MainInterface mainInterface =  new MainInterface();

    public abstract void buildMainWindow();
    public abstract void buildControllerBar();
    public abstract void buildMenu();
    public abstract void buildPlayList();
    public abstract void buildFavoriteList();

    public MainInterface getMainInterface(){
        return mainInterface;
    }



}
