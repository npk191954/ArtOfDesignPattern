package com.designpattern.art.state.pattern;

// 入门级状态类：具体状态类
public class PrimaryState extends PlayState{
    public PrimaryState(Player player) {
        this.player = player;
    }

    public PrimaryState(PlayState state) {
        this.player = state.player;
    }

    @Override
    public void play() {
        System.out.println("开始游戏");
    }

    @Override
    public void win() {
        System.out.println("游戏胜利，获取积分");
        int score = this.player.getScore() + 10;
        this.player.setScore(score);
        checkState();
    }

    @Override
    public void checkState() {
        if (this.player.getScore() >= 100 && this.player.getScore() < 500) {
            this.player.setState(new SecondaryState(this));
        }
        if (this.player.getScore() >= 500 && this.player.getScore() < 1000) {
            this.player.setState(new ProfessionalState(this));
        }
        if (this.player.getScore() >= 1000) {
            this.player.setState(new FinalState(this));
        }
    }
}
