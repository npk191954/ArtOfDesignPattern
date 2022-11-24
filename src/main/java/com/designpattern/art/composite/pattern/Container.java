package com.designpattern.art.composite.pattern;

import java.util.ArrayList;

// 具体容器组件类：具体容器构件类
public class Container extends Component {
    private String name;
    private ArrayList<Component> componentList = new ArrayList<>();

    public Container(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        this.componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        this.componentList.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return this.componentList.get(i);
    }

    @Override
    public void display() {
        for (Component component : this.componentList) {
            component.display();
        }
    }
}
