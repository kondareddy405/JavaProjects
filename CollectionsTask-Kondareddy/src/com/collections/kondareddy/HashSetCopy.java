package com.collections.kondareddy;

import java.util.HashSet;

public class HashSetCopy {
 
    public static void main(String a[]){
        HashSet<String> hs = new HashSet<String>();
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println(hs);
        HashSet<String> hs1 = new HashSet<String>();
        hs1.add("s1");
        hs1.add("s2");
        hs1.add("second");
        hs1.add("first");
        hs.addAll(hs1);
        hs.retainAll(hs1);
        System.out.println(hs);
        System.out.println("HashSet content after adding another collection:");
        System.out.println(hs);
    }
}