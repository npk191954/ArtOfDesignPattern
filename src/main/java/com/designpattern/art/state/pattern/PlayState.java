package com.designpattern.art.state.pattern;


// 抽象玩家状态类：抽象状态类
public abstract class PlayState {
    protected Player player;
    public abstract void play();
    public abstract void win();
    public void lose() {
        System.out.println("游戏失败，扣除积分");
        Integer score = player.getScore() - 10;
        this.player.setScore(score);
        checkState();
    }
    public abstract void checkState();
}
