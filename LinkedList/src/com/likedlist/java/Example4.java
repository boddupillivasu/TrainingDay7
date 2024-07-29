package com.likedlist.java;

import java.util.ArrayList;
import java.util.Iterator;


public class Example4 {
    public static void main(String[] args) {
        ArrayList<LastExampleOnLinkedList> ref = new ArrayList<LastExampleOnLinkedList>();
        LastExampleOnLinkedList lastExampleOnLinkedList;

        lastExampleOnLinkedList = new LastExampleOnLinkedList();
        lastExampleOnLinkedList.setPrice(4000);
        lastExampleOnLinkedList.setProductId(13);
        lastExampleOnLinkedList.setProductname("laptop");

        LastExampleOnLinkedList lastExampleOnLinkedList1;
        lastExampleOnLinkedList1 = new LastExampleOnLinkedList();
        ref.add(lastExampleOnLinkedList1);
        ref.add(lastExampleOnLinkedList);
        ref.add(new LastExampleOnLinkedList(12, "keyboard", 14));
        System.out.println("no of elements in array list is:" + ref.size());
        System.out.println(ref);

        System.out.println("displaying the elements (product object) using iterator");
        System.out.println("the details are:");
        Iterator<LastExampleOnLinkedList> obj = ref.iterator();
        while (obj.hasNext()) {
         //   System.out.println(obj.next());
            for (LastExampleOnLinkedList listd : ref) {

            LastExampleOnLinkedList lastExampleOnLinkedList2;
            lastExampleOnLinkedList2 = obj.next();
            System.out.println("product name:" + lastExampleOnLinkedList2.getProductname());
            System.out.println("product id:" + lastExampleOnLinkedList2.getProductId());
            System.out.println("product price :" + lastExampleOnLinkedList2.getPrice());

            }
            System.out.println("displaying the elements (product object) using java 8 for each loop");
            System.out.println("the details are:");
            ref.forEach(e -> System.out.println(e.getPrice()+" "+e.getProductId()+" "+e.getProductname()));
        }
    }
}