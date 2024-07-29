package com.array;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> ref = new ArrayList<Integer>();
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
    }
}
