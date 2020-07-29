package com.ximi.design.pattern.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * 多线程归并排序
 *
 * @author Ximi
 * @since 2020/07/28
 */
public class MultiThreadMergerSort implements SortStrategy{


    private ForkJoinPool pool = ForkJoinPool.commonPool();

    @Override
    public <E extends Comparable> void sort(List<E> data) {

    }

    public class SortTask<E extends Comparable> extends RecursiveTask<List<E>> {

        Integer first;
        Integer tail;
        List<E> data;

        public SortTask(List<E> data,Integer first, Integer tail) {
            this.first = first;
            this.tail = tail;
            this.data = data;
        }

        @Override
        protected List<E> compute() {

            if(first == tail){
                List<E> list = new ArrayList<>();
                list.add(data.get(first));
                return list;
            }

            SortTask left = new SortTask(data,first,(first + tail) / 2);
            SortTask right = new SortTask(data,(first + tail) / 2 + 1,tail);

            left.fork();
            right.fork();

            List<E> leftData = (List<E>) left.join();
            List<E> rightData = (List<E>) right.join();

            return null;
        }

        private List<E> merger(List<E> leftData,List<E> rightData){

            List<E> datas = new ArrayList<>();
            int leftIndex = 0;
            int rightIndex = 0;
            while (leftIndex != leftIndex){

            }

            return null;

        }


    }
}
