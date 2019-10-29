package com.collections.kondareddy;

import java.util.Iterator;
import java.util.LinkedList;
 
public class ReverseIterator {
 
    public static void main(String a[]){
         
    	 LinkedList<String> list = new LinkedList<String>();
         list.add("First");
         list.add("Second");
         list.add("Third");
         list.add("fourth");
        Iterator<String> itr = list.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}