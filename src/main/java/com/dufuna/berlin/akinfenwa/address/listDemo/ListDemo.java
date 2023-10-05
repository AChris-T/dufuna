package com.dufuna.berlin.akinfenwa.address.listDemo;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int roll;
    String name;
}

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();

        ArrayList<Object> list2 = new ArrayList();

        Student s1 = new Student();
        s1.roll = 101;
        s1.name ="Mike";

        list1.add("john");
        list1.add("jenny");
        list1.add("Habeeb");
        list1.add("Femi");
        list1.add("Dufuna");
        
        list2.add(2);
        list2.add(2.00);
        list2.add(2.4);
        list2.add(2.5);
        list2.add(2.7);
        list2.add("Korede");
        list2.add(s1);

        System.out.println("list1 is:" + list1);
        System.out.println("list1 is:" + list2);

        String name = list1.get(2);
        System.out.println("name is:"+ name);

        Object o =list2.get(2);
        System.out.println("o is:" +o);

        list1.remove(2);
        System.out.println("list after remove is:" + list1);

        if(list1.contains("John")) {
            System.out.println("John is in the list");
        }

        System.out.print("===Iterating with Loop===");
        for(int i=0; i<list1.size();i++){
            System.out.println(list1.get(i));
        }
        System.out.println("====Iterating with Enhanced For Loop====");
        for(String str : list1){
            System.out.println(str);
        }
        System.out.println("=======");
        System.out.println("===Iterating with Iterator");
        Iterator<String> itr = list1.iterator();
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());

        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
            if(str.equals("dufuna")){
                itr.remove();
            }
        }
        System.out.println("list1 after iteration is:" + list1);
        }
}
