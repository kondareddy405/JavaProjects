package com.collections.kondareddy;

import java.util.ArrayList;
public class CloneTest {
	public static void main(String[] args) {
	ArrayList<String> arr=new ArrayList<>();
	arr.add("hai");
	arr.add("hello");
	arr.add("reddy");
	System.out.println("Arraylist:"+arr);
	@SuppressWarnings({ "unchecked", "unused" })
	ArrayList<String> copy = (ArrayList<String>) arr.clone();
	System.out.println(copy);

	}

}
