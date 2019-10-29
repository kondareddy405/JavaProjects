package com.collections.kondareddy;

public class FindduplicateinArray {


		public static void main(String[] args) {
			String str="haithisiskondareddy";
			char[] letters=str.toCharArray();
			int count=0;
			for(int i=0;i<letters.length;i++) {
				if(letters[i]=='s') {
					
					count++;
				}
			}
	System.out.println("s count:"+count);
		}

	}

