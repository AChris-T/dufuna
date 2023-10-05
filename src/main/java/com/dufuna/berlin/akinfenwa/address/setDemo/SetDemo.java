package com.dufuna.berlin.akinfenwa.address.setDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
        public static void main(String[] args){

            TreeSet<String> set = new TreeSet<String>();
        //HashSet<String> set = new HashSet<String>();
        set.add("John");
        set.add("isaac");
        set.add("John");
        set.add("Joel");
        set.add("Chris");
        set.add("Chris");
        set.add("Ayomide");
        set.add("Ayo");
        set.add("John");

        System.out.print("Set is:" + set);

            for (String str : set) {
                System.out.println(str);
            }
            set.remove("Chris");
            System.out.println("set after removing jim is:" +set);

            if(set.contains("Ayo")){
                System.out.println("ayo is in the List");
            }else {
                System.out.println("ayo is not in the List");
            }
            System.out.println("set size is:" +set.size());
    }

}
