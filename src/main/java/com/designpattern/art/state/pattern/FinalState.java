package com.designpattern.art.state.pattern;

// 骨灰级状态类：具体状态类
public class FinalState extends ProfessionalState{
    public FinalState(PlayState state) {
        super(state);
    }

    @Override
    public void play() {
        super.play();
        peekCards();
    }

    public void peekCards() {
        System.out.println("启用偷看别人牌的功能");
    }

    @Override
    public void checkState() {
        if (this.player.getScore() >= 500 && this.player.getScore() < 1000) {
            this.player.setState(new ProfessionalState(this));
        }
        if (this.player.getScore() >= 100 && this.player.getScore() < 500) {
            this.player.setState(new SecondaryState(this));
        }
        if (this.player.getScore() < 100) {
            this.player.setState(new PrimaryState(this));
        }
    }
}
