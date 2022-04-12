package com.namaste.array;

import java.util.*;

/**
 * @author luzhang
 */
/*
https://www.nowcoder.com/questionTerminal/e016ad9b7f0b45048c58a9f27ba618bf
 */
public class FindKth {

    /*
    快排法实现
     */
    public static int findKth1(int[] a, int n, int K) {
        quickSort(a,0,n-1);
        return a[n-K];
    }

    public static int[] quickSort(int[] arr,int l,int r){
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

    /*
    冒泡排序实现
     */
    public static int findKth2(int[] a, int n, int K) {
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=n-1;j>i;j--){
                if(a[j-1]>a[j]){
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        return a[n-K];
    }

    public static void main(String[] args){
        //49,24
        int[] nums=new int[]{1332802,1177178,1514891,871248,753214,123866,1615405,328656,1540395,968891,1884022,252932,1034406,1455178,821713,486232,860175,1896237,852300,566715,1285209,1845742,883142,259266,520911,1844960,218188,1528217,332380,261485,1111670,16920,1249664,1199799,1959818,1546744,1904944,51047,1176397,190970,48715,349690,673887,1648782,1010556,1165786,937247,986578,798663};
        //5,3
        //int[] nums=new int[]{1,3,5,2,2};
        System.out.println(findKth1(nums,49,24));
    }
}
