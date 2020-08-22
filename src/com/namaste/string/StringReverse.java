package com.namaste.string;

public class StringReverse {

    public static int reverse(int x) {
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

    public static boolean isPalindrome(int x) {
        int res=0;
        while(x!=0){
            if(Math.abs(res)>Integer.MAX_VALUE/10) return false;
            res=res*10+x%10;
            x/=10;
        }
        if(res==x){
            return true;
        }
        else{
            return false;
        }
    }

    public static int romanToInt(String s) {
        int res=0;
        int cur=0;
        int pre=0;
        char[] chars=s.toCharArray();
        for (int i=chars.length-1;i>=0;i--) {
            switch(chars[i]){
                case 'I': cur=1;break;
                case 'V': cur=5;break;
                case 'X': cur=10;break;
                case 'L': cur=50;break;
                case 'C': cur=100;break;
                case 'D': cur=500;break;
                case 'M': cur=1000;
            }

            if(cur>=pre){
                res=res+cur;
            }
            else{
                res=res-cur;
            }
            pre=cur;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));

    }

}
