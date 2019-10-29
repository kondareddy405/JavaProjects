package com.collections.kondareddy;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<>();
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
