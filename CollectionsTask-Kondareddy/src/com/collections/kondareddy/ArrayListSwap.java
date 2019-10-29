package com.collections.kondareddy;

import java.util.ArrayList;
import java.util.Collections;
 
public class ArrayListSwap {
 
    public static void main(String a[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        Collections.swap(list, 2, 3);
        System.out.print("Results after swap operation:");
        for(String str: list){
            System.out.println(str);
        }
    }
}