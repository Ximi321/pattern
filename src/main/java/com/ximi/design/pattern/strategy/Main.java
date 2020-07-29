package com.ximi.design.pattern.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       Integer[] x = new Integer[]{3,6,8,4,7,9,1,10};

        ArrayList<Integer> data = new ArrayList<>();
        data.addAll(Arrays.asList(x));

//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.sort(data);

//        QuickSort quickSort = new QuickSort();
//        quickSort.sort(data);

//        MultiThreadMergerSort mergerSort = new MultiThreadMergerSort();
//        mergerSort.sort(data);

        SortStrategy sortStrategy =  SortFactory.getSortStrategy(data.size());
        sortStrategy.sort(data);
        print(data);
    }

    public static void print(List<Integer> list){
        for (Integer info:list){
            System.out.print(" " + info);
        }
        System.out.println();
    }
}
