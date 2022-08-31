package com.designpattern.art.state.pattern;

// 具体玩家类：环境类
public class Player {
    private String name;
    private Integer score;
    private PlayState state;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.state = new PrimaryState(this);
        System.out.println("新建帐户，积分为：" + this.score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public PlayState getState() {
        return state;
    }

    public void setState(PlayState state) {
        this.state = state;
    }

    public void play() {
        this.state.play();
    }

    public void win() {
        this.state.win();
        System.out.println("积分为：" + this.score);
        System.out.println("状态为：" + this.state.getClass().getSimpleName());
    }

    public void lose() {
        this.state.lose();
        System.out.println("积分为：" + this.score);
        System.out.println("状态为：" + this.state.getClass().getSimpleName());
    }
}
