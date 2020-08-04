package com.ximi.design.pattern.iterator;

/**
 * 集合抽象类
 *
 * @param <E>
 * @author Ximi
 * @since 2020/08/04
 */
public interface Collection<E> {

    /**
     * 添加元素
     *
     * @param e
     * @return
     */
    public Boolean add(E e);

    /**
     * 移除元素
     *
     * @param e
     * @return
     */
    public Boolean remove(E e);

    /**
     * 集合的大小
     * @return
     */
    public Integer size();

    /**
     * 迭代器
     *
     * @return
     */
    public Iterator<E> iterator();

}
