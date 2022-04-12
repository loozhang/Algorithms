package com.namaste.array;

import com.namaste.common.Common;

/**
 * @author luzhang
 */
public class Fibonacci {
    public static void main(String[] args){
        int n=10;
        int[] arr=new int[10];
        for(int i=0;i<n;i++){
            arr[i]=func(i);
        }
        Common.PrintArray(arr);
    }


    public static int func(int n){
        if(n<2) {
            return 1;
        }
        return func(n-2)+func(n-1);
    }
}
