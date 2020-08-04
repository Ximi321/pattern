package com.ximi.design.pattern.iterator;

public class Main {

    public static void main(String[] args) {

        ArrayCollection<Integer> arrayCollection = new ArrayCollection<>();

        for (int index = 0; index < 10; index++) {
            arrayCollection.add(index);
        }

        arrayCollection.remove(5);
        arrayCollection.remove(9);

        Iterator iterator = arrayCollection.iterator();

//        arrayCollection.add(10);

        while (iterator.hasNext()) {
            Integer integer = (Integer) iterator.next();
            System.out.println(integer);
        }

    }
}
