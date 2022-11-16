package com.emmy.collections.linkedList;

import java.util.LinkedList;

public class LinkedListLearning {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.remove();

        System.out.println(numbers.size());

//        int counter = 1;
//        for(Integer number : numbers){
//            System.out.println(counter + " : "  + number);
//            counter ++;
//        }
    }
}
