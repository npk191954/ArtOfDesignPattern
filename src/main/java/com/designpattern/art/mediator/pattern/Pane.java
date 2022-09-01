package com.designpattern.art.mediator.pattern;

// 抽象窗格类：抽象同事类
public abstract class Pane {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void changed() {
        this.mediator.paneChanged(this);
    }

    public abstract void update();
}
