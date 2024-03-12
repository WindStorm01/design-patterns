package com.rh.builder.main;

import com.rh.builder.entity.MainInterface;
import com.rh.builder.inteface.MainBuilder;

/**
 * 主页面建造：Director（指挥者)
 */
public class MainDirector {

    public MainInterface construct(MainBuilder builder){
        builder.buildMainWindow();
        builder.buildControllerBar();
        builder.buildMenu();
        builder.buildPlayList();
        builder.buildFavoriteList();
        MainInterface mainInterface = builder.getMainInterface();
        return mainInterface;
    }
}
