package com.collections.kondareddy;


	import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
	 
	public class TreeMapCopy {
	 
	    public static void main(String a[]){
	        TreeMap<String, String> hm = new TreeMap<String, String>();
	       
	        hm.put("first", "FIRST INSERTED");
	        hm.put("second", "SECOND INSERTED");
	        hm.put("third","THIRD INSERTED");
	        System.out.println(hm);
	        TreeMap<String, String> subMap = new TreeMap<String, String>();
	        subMap.put("s1", "S1 VALUE");
	        subMap.put("s2", "S2 VALUE");
	        hm.putAll(subMap);
	        System.out.println(hm);
	    //get firstkey
	        
	
	    
	  //searchkey
       
        if(hm.containsKey("five")){
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
            System.out.println("The Treemap contains value SECOND INSERTED");
        } else {
            System.out.println("The Treemap does not contains value SECOND INSERTED");
        }
        if(hm.containsValue("first")){
            System.out.println("The Treemap contains value first");
        } else {
            System.out.println("The Treemap does not contains value first");
        }
	//
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
	}
	}