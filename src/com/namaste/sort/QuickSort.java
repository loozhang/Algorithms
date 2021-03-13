package com.namaste.sort;

import com.namaste.common.*;

public class QuickSort {
	public static void main(String[] args) 
	{
		int[] arr=new int[] {3,2,1,7,8,5,3};
		Common.PrintArray(quickSort(arr,0,arr.length-1));
		
	}
	
	public static int[] quickSort(int[] arr,int l,int r) {
		if(l<r){
			int i=l;int j=r;int key=arr[l];
			while(i<j) {
				while(i<j&&arr[j]>=key)
					j--;
				if(i<j)
					arr[i++]=arr[j];
				while(i<j&&arr[i]<key)
					i++;
				if(i<j)
					arr[j--]=arr[i];
			}
			arr[i]=key;
			quickSort(arr,l,i-1);
			quickSort(arr,i+1,r);
		}
		return arr;
	}
}
