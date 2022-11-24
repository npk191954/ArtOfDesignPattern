package com.designpattern.art.iterator.pattern;

import java.util.List;

// 抽象分页迭代器类：抽象迭代器类
public abstract class PageIterator {
    public abstract void previousPage();
    public abstract void nextPage();
    public abstract Boolean isFirstPage();
    public abstract Boolean isLastPage();
    public abstract List<Object> getPreviousPage();
    public abstract List<Object> getNextPage();
}
