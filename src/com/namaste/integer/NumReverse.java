package com.namaste.integer;

public class NumReverse {
    public static void main(String args[]){
        System.out.print(reverse3(123));
    }

    /*
    for循环解法
     */
    public static int reverse1(int num){
        int r=0;
        for(;num>0;num/=10){
            r=num%10+r*10;
        }
        return r;
    }

    /*
    while解法
     */
    public static int reverse2(int x) {
        int a;
        int b=x;
        int c=0;

        while(b!=0){
            if(Math.abs(c)>Integer.MAX_VALUE/10) return 0;
            a=b%10;
            b=b/10;
            c=c*10+a;
        }

        return c;
    }

    public static int reverse3(int x){
        long res=0;
        while (x>0){
            res=x%10+res*10;
            x/=10;
        }
        return (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) ? 0 : (int)res;
    }
}
