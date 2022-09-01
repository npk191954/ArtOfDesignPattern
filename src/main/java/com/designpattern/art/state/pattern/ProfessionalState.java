package com.designpattern.art.state.pattern;

// 高手级状态类：具体状态类
public class ProfessionalState extends SecondaryState{
    public ProfessionalState(PlayState state) {
        super(state);
    }

    @Override
    public void play() {
        super.play();
        changeCards();
    }

    public void changeCards() {
        System.out.println("启用换牌功能");
    }

    @Override
    public void checkState() {
        if (this.player.getScore() >= 1000) {
            this.player.setState(new FinalState(this));
        }
        if (this.player.getScore() >= 100 && this.player.getScore() < 500) {
            this.player.setState(new SecondaryState(this));
        }
        if (this.player.getScore() < 100) {
            this.player.setState(new PrimaryState(this));
        }
    }
}
