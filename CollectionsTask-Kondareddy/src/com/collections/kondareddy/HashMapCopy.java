package com.collections.kondareddy;

import java.util.HashMap;

public class HashMapCopy {
	 
    public static void main(String [] args){
    	
            HashMap<Integer, String> hm = new HashMap<Integer, String>();
            hm.put(1,"first");
            hm.put(2,"second");
            hm.put(3,"third");
        System.out.println(hm);
        HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
       hm1.put(4, "four");
       hm1.put(5, "five");
       hm.putAll(hm1);
       System.out.println(hm);
      
      
    }
}