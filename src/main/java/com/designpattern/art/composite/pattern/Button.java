package com.designpattern.art.composite.pattern;

// 具体按钮组件类：具体叶子构件类
public class Button extends Component {
    private String name;

    public Button(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
    }

    @Override
    public void remove(Component component) {
    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void display() {
        System.out.println("按钮显示：" + this.name);
    }
}
