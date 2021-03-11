package com.namaste.array;

/*
给定一个数组和一个值，在原地移除所有的这个值的实例，并且返回新的数组长度。元素的顺序可以被改变。(而该数组在超过新长度的部分，可以不去管它)
 */
public class RemoveElement {

    /*
    覆盖法
     */
    public static int removeElement(int[] nums,int val){
        int nextEmpty=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[nextEmpty++]=nums[i];
            }
        }
        return nextEmpty;
    }

    public static void main(String[] args){
        int[] nums=new int[]{1,2,3,3,2,3,5,1,3};
        System.out.println(removeElement(nums,3));
    }
}
