package com.designpattern.art.iterator.pattern;

import java.util.List;

// 具体对象列表类：具体聚合类
public class ConcreteObjectList extends AbstractObjectList{

    public ConcreteObjectList(List<Object> objects) {
        super(objects);
    }

    @Override
    public PageIterator createPageIterator() {
        return new ConcretePageIterator(this, 5);
    }
}
