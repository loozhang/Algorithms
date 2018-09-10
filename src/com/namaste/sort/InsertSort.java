package com.namaste.sort;

import com.namaste.common.*;

public class InsertSort {
	public static void main(String[] args) 
	{
		int[] arr=new int[] {3,2,1,7,8,5,3};
		insertSort(arr);
	}
	
	public static void insertSort(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else
				{
					break;
				}
			}
		}
		Common.Print(arr);
	}
}
