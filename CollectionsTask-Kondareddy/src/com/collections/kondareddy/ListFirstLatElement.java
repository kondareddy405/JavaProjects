package com.collections.kondareddy;

import java.util.LinkedList;

public class ListFirstLatElement {
 
    public static void main(String[] args){
         
        LinkedList<String> list = new LinkedList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("fourth");
        
        System.out.println("First Element: "+list.getFirst());
        System.out.println("Last Element: "+list.getLast()); 
    }
}
