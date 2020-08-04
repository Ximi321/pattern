package com.ximi.design.pattern.iterator;

/**
 * 迭代器
 *
 * @author Ximi
 * @since 2020/08/04
 * @param <E>
 */
public interface Iterator<E> {

    /**
     * 还有下一个元素
     * @return
     */
    public Boolean hasNext();

    /**
     * 返回当前元素,指向下一个元素
     * @return
     */
    public E next();

}
