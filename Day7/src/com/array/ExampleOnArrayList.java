package com.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleOnArrayList {
    public static void main(String[] args) {
        /*
        list<t> ref variable = new Arraylist<object>
        here<object> is the data type we can store any datatype inside the "object"
        array list are
        <object> is the "jenaric " is responsible for compailer  to store which data type  is stored in in array list
        array list is allows  duplicates
         */
        List<Object>  a1= new ArrayList<Object>();
        // we can store the elements in array list using add() method
        a1.add(12);
        a1.add("hello");
        a1.add(12.32f);
        a1.add('h');
        a1.add(true);
        a1.add(626.636d);
        a1.add("hello java");
        a1.add(12);// duplicate
        System.out.println("no of elements in array list:"+a1.size());
        System.out.println(a1);
        System.out.println("displaying elements using iterator");
        Iterator<Object>  ref = a1.iterator();
        while (ref.hasNext()){
            System.out.println(ref.next());

        }
    }
}
