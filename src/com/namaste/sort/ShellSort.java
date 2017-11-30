package com.namaste.sort;

import com.namaste.common.*;

public class ShellSort {
	public static void main(String[] args) 
	{
		int[] arr=new int[] {3,2,1,7,8,5,3};
		ShellSort(arr,arr.length);
	}
	
    public static void ShellSort(int[] arr,int length) {
    	int temp;
    	int incre=length;
    	while(true) {
    		incre=incre/2;
    		for(int k=0;k<incre;k++) {  //按照步长分成若干组，k为第一个元素
    			for(int i=k+incre;i<length;i+=incre) {  //i用来循环每组的后续
    				for(int j=i;j>k;j-=incre) {  //j用来实现插入算法的最后一次循环
    					if(arr[j]<arr[j-incre]) {
    						temp=arr[j];
    						arr[j]=arr[j-incre];
    						arr[j-incre]=temp;
    					}
    					else {
    						break;
    					}
    				}
    			}
    		}
    		if(incre==1) {
    			break;
    		}
    	}
    	Common.Print(arr);
    }
}
