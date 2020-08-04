package com.ximi.design.pattern.iterator;

import java.util.Arrays;
import java.util.ConcurrentModificationException;

/**
 * 数组的集合
 *
 * @param <E>
 * @author Ximi
 * @since 2020/08/04
 */
public class ArrayCollection<E> implements Collection<E> {

    private Object[] elements;
    private int modCount;
    private int size;

    public ArrayCollection() {
        elements = new Object[8];
        size = 0;
        modCount = 0;
    }

    @Override
    public Boolean add(E e) {
        modCount++;
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);   //这么没有考虑数组极限
        }
        elements[size++] = e;
        return true;
    }

    @Override
    public Boolean remove(E e) {
        for (int index = size - 1; index >= 0; index--) {
            if(elements[index] == e){
                remove(index);
            }
        }
        return true;
    }

    private void remove(int index){
        modCount++;
        if(index != size -1){
            System.arraycopy(elements,index + 1,elements,index,size - 1 - index);
        }
        elements[size - 1] = null;
        size--;
    }

    @Override
    public Integer size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterable<E>();
    }

    public class ArrayIterable<E> implements Iterator<E> {

        private int expectModCount;
        private int curson;

        public ArrayIterable() {
            this.expectModCount = modCount;
            this.curson = 0;
        }

        @Override
        public Boolean hasNext() {
            return curson < size();
        }

        @Override
        public E next() {
            if (expectModCount != modCount) {
                throw new ConcurrentModificationException();
            }
            return (E) elements[curson++];
        }
    }
}
