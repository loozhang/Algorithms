package com.namaste.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstUniqueChar {

	/*
	使用LinkedHashMap，因为它是有序的，可以实现“第一个”的逻辑
	 */
	public static String firstUniqueChar(String s) {
		String ans=null;
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char c:s.toCharArray()) {
			if(!map.containsKey(c))
				map.put(c, 1);
			else map.put(c,map.get(c)+1);
		}
		for(Entry<Character,Integer> en:map.entrySet()) {
			if(en.getValue()==1) return en.getKey().toString();
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String test="abceabc";
		String res=firstUniqueChar(test);
		System.out.println(res);
	}
}
