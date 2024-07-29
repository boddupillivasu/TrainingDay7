package com.likedlist.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Example2OnLinkedList {

    public static void main(String[] args) {


       LinkedList<Integer> ref = new LinkedList<Integer>();
        ref.add(12);
        ref.add(13);
        ref.add(123);
        ref.add(1233);
        ref.add(1232);
        ref.sort((i1, i2) -> i1.compareTo(i2));
        System.out.println("after sorting in ascending order");
        System.out.println(ref);
        ref.sort((i1, i2) -> i2.compareTo(i1));
        System.out.println("after sorting in decending order");
        System.out.println(ref);
        ListIterator<Integer> ref1 = ref.listIterator();;
        System.out.println("elements displaying in forword direction or inserstion order");
        while (ref1.hasNext()){
            System.out.println(ref1.next());
        }
        System.out.println("elements displaying in backword direction ");
        while (ref1.hasPrevious()){
            System.out.println(ref1.previous());
        }
    }
}
