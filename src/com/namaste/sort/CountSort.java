package com.namaste.sort;

import com.namaste.common.Common;

public class CountSort {
    public static void main(String[] args)
    {
        int[] arr={101,109,107,103,108,102,103,110,107,103};
        Common.Print(countSort(arr));
    }

    public static int[] countSort(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int a:arr){
            max=Math.max(max,a);
            min=Math.min(min,a);
        }
        int[] count=new int[max-min+1];
        for(int a:arr){
            count[a-min]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        int[] result=new int[arr.length];
        for(int j=arr.length-1;j>=0;j--){
            result[count[arr[j]-min]-1]=arr[j];
            count[arr[j]-min]--;
        }
        return result;
    }
}
