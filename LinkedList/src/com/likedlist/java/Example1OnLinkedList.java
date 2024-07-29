package com.likedlist.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example1OnLinkedList {
    public static void main(String[] args) {



                LinkedList<String> fruits = new LinkedList<String>();
                //Add () method are using for add  details for Array list
                fruits.add("banana");
                fruits.add("apple");
                fruits.add("grapes");
                fruits.add("pineapple");
                fruits.add("watermilon");
                System.out.println("size of an array:" + fruits.size());
                System.out.println(fruits);

                //adding element the  specific  position

                fruits.add(2, "orange");
                System.out.println("after changing the new element");
                System.out.println(fruits);
                // replacing te element at specific posiion

                fruits.set(3, "mango");
                System.out.println("after set te value");
                System.out.println(fruits);

                // search an element  in arraylist using boolean contains()
                boolean b = fruits.contains("banana");
                System.out.println("the element  banana is there:" + b);
                boolean bx = fruits.contains("dragon fruit");
                System.out.println("the element  dragon fruit is there:" + bx);

                // remove the element in collection class that is array list
                String a = fruits.remove(0);
                System.out.println("removed element in array list at 0:" + a);
                System.out.println("after remove the array list");
                System.out.println(fruits);

                // 2nd way
                boolean s = fruits.remove("apple");
                System.out.println("the remove element:" + s);
                System.out.println(fruits);

                //
                System.out.println("displaying the using iterator method");
                Iterator<String> ref = fruits.iterator();// iterator method
                while (ref.hasNext()) {
                    System.out.println(ref.next());// actual object will return
                }
                for (String r : fruits) {
                    System.out.println(s);

                }
                System.out.println(" ");
                System.out.println("displayoing elments java8 for each loop");
                fruits.forEach(e -> System.out.println(e));// lamda expression
                System.out.println(" ");
                //method reference
                System.out.println("usiing methodrefernce for each");
                fruits.forEach(System.out::println);

            }
        }



