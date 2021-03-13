package com.namaste.common;

import java.util.*;

public class Common {
	public static void PrintArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+",");
		}
	}

	public static void MapToString(Map<Character,Integer> map){
		StringBuilder s=new StringBuilder();
		for (Character c: map.keySet()){
			s.append(c);
		}
		System.out.print(s.toString());
	}
}
