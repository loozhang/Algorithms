package com.namaste.sort;

import com.namaste.common.Common;

public class MergeSort {
	public static void main(String[] args) 
	{
		int[] arr=new int[] {3,2,1,7,8,5,3};
		int[] temp=new int[7];
		merge_sort(arr,0,6,temp);
		Common.Print(arr);
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
				temp[k]=a[i];
				i++;
				k++;
			}
			else {
				temp[k]=a[j];
				j++;
				k++;
			}
		}
		while(i<=m) {
			temp[k]=a[i];
			i++;
			k++;
		}
		while(j<=n) {
			temp[k]=a[j];
			j++;
			k++;
		}
		for(int ii=0;ii<k;ii++) {
			a[first+ii]=temp[ii];
		}
	}
}