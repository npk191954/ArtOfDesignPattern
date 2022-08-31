package com.designpattern.art.state.pattern;

public class Client {
    public static void main(String[] args) {
        Player player = new Player("段誉");
        player.play();
        player.win();
        player.lose();
    }
}
