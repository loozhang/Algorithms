package com.namaste.sort;

import com.namaste.common.Common;

public class SelectSort {
	public static void main(String[] args) 
	{
		int[] arr=new int[] {3,2,1,7,8,5,3};
		selectSort(arr);
	}
	
	public static void selectSort(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[minIndex])
				{
					minIndex=j;
				}
			}
			if(minIndex!=i)
			{
				temp=arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;				
			}
		}
		Common.Print(arr);
	}
}
