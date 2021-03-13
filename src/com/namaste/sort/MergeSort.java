package com.namaste.sort;

import com.namaste.common.Common;

public class MergeSort {
	public static void main(String[] args) 
	{
		int[] arr=new int[] {3,2,1,7,8,5,3};
		int[] temp=new int[arr.length];
		merge_sort(arr,0,arr.length-1,temp);
		Common.PrintArray(arr);
	}
	
	public static void merge_sort(int[] a,int first,int last,int[] temp) {
		if(first<last) {
			int middle=(first+last)/2;
			merge_sort(a,first,middle,temp);
			merge_sort(a,middle+1,last,temp);
			mergeArray(a,first,middle,last,temp);
		}

	}
	
	public static void mergeArray(int[] a,int first,int middle,int end,int[] temp) {
		int i=first;
		int m=middle;
		int j=middle+1;
		int n=end;
		int k=0;
		while(i<=m&&j<=n) {
			if(a[i]<a[j]) {
				temp[k++]=a[i++];
			}
			else {
				temp[k++]=a[j++];
			}
		}
		while(i<=m) {
			temp[k++]=a[i++];
		}
		while(j<=n) {
			temp[k++]=a[j++];
		}
		for(int ii=0;ii<k;ii++) {
			a[first+ii]=temp[ii];
		}
	}
}