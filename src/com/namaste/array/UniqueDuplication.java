package com.namaste.array;

//https://blog.csdn.net/he__yuan/article/details/80187793
public class UniqueDuplication {

    public static void main(String[] args){
        int[] a=new int[]{1,2,3,4,5,6,7,8,9,10,7};
        System.out.println(uniqueDuplication(a));
    }

    public static int uniqueDuplication(int[] nums){
        int i,x1=0,x2=0,len=nums.length;
        for(i=0;i<len;i++)//数组所有元素 异或
        {
            x1^=nums[i];

        }
        for(i=1;i<len;i++)//数组所有不重复的元素 异或
        {
            x2^=i;

        }
        return x1^x2;
    }
}
