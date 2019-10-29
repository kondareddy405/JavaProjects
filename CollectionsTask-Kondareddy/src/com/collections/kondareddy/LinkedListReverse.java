package com.collections.kondareddy;

import java.util.Collections;
import java.util.LinkedList;
 
public class LinkedListReverse {
 
    public static void main(String a[]){
         
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("spring");
        list.add("hibernate	");
        Collections.reverse(list);
        System.out.println("Results after reverse operation:");
        for(String str: list){
            System.out.println(str);
        }
    }
}