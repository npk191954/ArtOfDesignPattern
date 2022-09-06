package com.designpattern.art.builder.pattern;

// 具体播放界面建造指挥者类：具体指挥者类
public class Director {
    public PlayScreen construct(PlayScreenBuilder builder) {
        builder.buildMainWindow();
        builder.buildMenu();
        builder.buildPlayList();
        builder.buildControlBar();
        builder.buildFavoriteList();
        return builder.getResult();
    }
}
