package com.namaste.array;

public class NumReverse {
    public static void main(String args[]){
        System.out.print(reverse(123));
    }

    public static int reverse(int num){
        int r=0;
        for(;num>0;num/=10){
            r=num%10+r*10;
        }
        return r;
    }
}
