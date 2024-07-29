package com.likedlist.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleLinkedList {

    public static void main(String[] args) {


            List<Object> a1= new ArrayList<Object>();
            // we can store the elements in array list using add() method
            a1.add(12);
            a1.add("hello");
            a1.add(12.32f);
            a1.add('h');
            a1.add(true);
            a1.add(626.636d);
            a1.add("hello java");
            a1.add(12);// duplicate
            System.out.println("no of elements in linked list:"+a1.size());
            System.out.println(a1);
            System.out.println("displaying elements using iterator");
            Iterator<Object> ref = a1.iterator();
            while (ref.hasNext()) {
                System.out.println(ref.next());
            }
            }
        }



