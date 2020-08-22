package com.namaste.string;

import com.namaste.common.Common;

import java.util.*;

public class Deduplication {
	//常规方法
	public static void Solution1(String array) {
		List<Character> result = new ArrayList<>();
		for(int i=0;i<array.length();i++){
			boolean flag = false;
			for(int j=0;j<result.size();j++){
				if(array.charAt(i)==result.get(j)){
					flag = true;
					break;
				}
			}
			if(!flag){
				result.add(array.charAt(i));
			}
		}

		System.out.println(result);
	}

	public static void Solution2(String array){
		int n=array.length();
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0,j=0;j<n;j++){
			map.put(array.charAt(j),j+1);
		}
		Common.MapToString(map);
	}

    public static void main(String[] args) {
    	String array="bbccdeeea";
		Solution2(array);
    }
}