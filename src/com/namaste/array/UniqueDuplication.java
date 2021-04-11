package com.namaste.array;

//https://blog.csdn.net/he__yuan/article/details/80187793
public class UniqueDuplication {

    public static void main(String[] args){
        int[] a=new int[]{1,2,3,4,5,6,7,7,8,9,10};
        System.out.println(uniqueDuplication1(a));
    }

    //累加和法
    public static int uniqueDuplication1(int[] nums){
        int i,res=0,len=nums.length;
        for(i=0;i<len-1;i++){
            res+=nums[i]-(i+1);
        }
        res+=nums[len-1];
        return res;
    }

    //异或法
    public static int uniqueDuplication2(int[] nums){
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
