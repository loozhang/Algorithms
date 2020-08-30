package com.namaste.sort;

import com.namaste.common.Common;

import java.util.Arrays;

public class BucketSort {
    public static void main(String[] args)
    {
        int[] arr={101,109,107,103,108,102,103,110,107,103};
        Common.Print(bucketSort(arr,3));
    }

    public static int[] bucketSort(int[] arr,int bucketSize){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int a:arr){
            min=Math.min(min,a);
            max=Math.max(max,a);
        }

        int bucketCount=(int)Math.floor((max-min)/bucketSize)+1;
        int[][] buckets=new int[bucketCount][0];

        for(int i=0;i<arr.length;i++){
            int index=(int)Math.floor((arr[i]-min)/bucketCount);
            buckets[index]=arrayAppend(buckets[index],arr[i]);
        }

        int arrIndex=0;
        for(int[] bucket:buckets){
            if(bucket.length==0){
                continue;
            }
            insertSort(bucket);
            for(int value:bucket){
                arr[arrIndex++]=value;
            }
        }
        return arr;
    }

    public static void insertSort(int[] arr){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    public static int[] arrayAppend(int[] arr,int value){
        arr= Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1]=value;
        return arr;
    }
}
