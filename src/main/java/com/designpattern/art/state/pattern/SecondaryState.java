package com.designpattern.art.state.pattern;

// 熟练级状态类：具体状态类
public class SecondaryState extends PrimaryState{
    public SecondaryState(PlayState state) {
        super(state);
    }

    @Override
    public void win() {
        System.out.println("游戏胜利，获取积分");
        doubleScore();
        checkState();
    }

    public void doubleScore() {
        int score = this.player.getScore() + 10*2;
        this.player.setScore(score);
    }

    @Override
    public void checkState() {
        if (this.player.getScore() >= 500 && this.player.getScore() < 1000) {
            this.player.setState(new ProfessionalState(this));
        }
        if (this.player.getScore() < 100) {
            this.player.setState(new PrimaryState(this));
        }
        if (this.player.getScore() >= 1000) {
            this.player.setState(new FinalState(this));
        }
    }
}
