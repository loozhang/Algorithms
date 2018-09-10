package com.namaste.string;

import java.util.ArrayList;
import java.util.List;

public class Dereplication {
	public static void dereplication(String array) {
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

    public static void main(String[] args) {
    	String array="bbccdeeea";
		dereplication(array);
    }
}