package com.namaste.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Dereplication {
	public static void dereplication(String[] array) {
		List<String> result = new ArrayList<>();
		for(int i=0;i<array.length;i++){
			boolean flag = false;
			for(int j=0;j<result.size();j++){
				if(array[i]==result.get(j)){
					flag = true;
					break;
				}
			}
			if(!flag){
				result.add(array[i]);
			}
		}

		String[] arrayResult = (String[]) result.toArray(new String[result.size()]);
		System.out.println(Arrays.toString(arrayResult));
	}

    public static void main(String[] args) {
		String[] array = {"b","b","c","c","d","e","e","e","a"};
		dereplication(array);
    }
}