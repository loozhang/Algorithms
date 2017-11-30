package com.namaste.sort;

import com.namaste.common.*;

public class QuickSort {
	public static void main(String[] args) 
	{
		int[] arr=new int[] {3,2,1,7,8,5,3};
		QuickSort(arr,0,arr.length-1);
		
	}
	
	public static void QuickSort(int[] arr,int l,int r) {
		if(l>=r) {
			System.out.println(arr[l]);
			return;	
		}

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
		QuickSort(arr,l,i-1);
		QuickSort(arr,i+1,r);
		
		//Common.Print(arr);
	}
}
