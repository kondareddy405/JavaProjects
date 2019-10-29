package com.collections.kondareddy;
import java.util.ArrayList;
import java.util.Collections;
 
public class ArrayListShuffle {
 
    public static void main(String [] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");    
        Collections.shuffle(list);
        System.out.println("Results after shuffle operation:");
        for(String str: list){
            System.out.println(str);
        }
    }
}