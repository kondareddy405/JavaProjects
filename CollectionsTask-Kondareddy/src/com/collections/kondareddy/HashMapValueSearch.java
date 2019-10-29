package com.collections.kondareddy;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapValueSearch {
     
    public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<String, String>();
       //searchkey
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsKey("first")){
            System.out.println("The hashmap contains key");
        } else {
            System.out.println("The hashmap does not contains key");
        }
        
    //searchvalue
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsValue("SECOND INSERTED")){
            System.out.println("The hashmap contains value SECOND INSERTED");
        } else {
            System.out.println("The hashmap does not contains value SECOND INSERTED");
        }
        if(hm.containsValue("first")){
            System.out.println("The hashmap contains value first");
        } else {
            System.out.println("The hashmap does not contains value first");
        }
    //getAllkeys
        Set<String> keys = hm.keySet();
        for(String key: keys){
            System.out.println(key);
    
    }
    //entryset
        Set<Entry<String, String>> entires = hm.entrySet();
        for(Entry<String,String> ent:entires){
            System.out.println(ent.getKey()+" = "+ent.getValue());
    } 
//delete all elements in hashmap
        hm.clear();
        System.out.println(hm);
    }
}