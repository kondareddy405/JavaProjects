package com.collections.kondareddy;

import java.util.LinkedList;

public class LinkedListToArray {

	public static void main(String[] args) {
		LinkedList<String> arr=new LinkedList<>();
		arr.add("first");
		arr.add("second");
		arr.add("third");
		System.out.println("ArrayList:" +arr);
		String[] Str=new String[arr.size()];
		arr.toArray(Str);
		for(String str1:Str) {
			System.out.println( str1);
		}
		

	}

}