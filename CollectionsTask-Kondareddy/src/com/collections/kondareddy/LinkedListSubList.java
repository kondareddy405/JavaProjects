package com.collections.kondareddy;
import java.util.LinkedList;
import java.util.List;
 
public class LinkedListSubList {
 
    public static void main(String a[]){
         
        LinkedList<String> list = new LinkedList<String>();

        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("fourth");
        list.add("five");
        System.out.println("Actual LinkedList:"+list);
        List<String> list1 = list.subList(2, 4);
        System.out.println("Sub List: "+list1);
    }
}