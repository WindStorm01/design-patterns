package com.rh.builder.entity;

/**
 * 主页面：产品角色（product）
 */
public class MainInterface {

    private ControllerBar controllerBar;
    private FavoriteList favoriteList;
    private MainWindow mainWindow;
    private Menu menu;
    private PlayList playList;

    public ControllerBar getControllerBar() {
        return controllerBar;
    }

    public void setControllerBar(ControllerBar controllerBar) {
        this.controllerBar = controllerBar;
    }

    public FavoriteList getFavoriteList() {
        return favoriteList;
    }

    public void setFavoriteList(FavoriteList favoriteList) {
        this.favoriteList = favoriteList;
    }

    public MainWindow getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public PlayList getPlayList() {
        return playList;
    }

    public void setPlayList(PlayList playList) {
        this.playList = playList;
    }
}
