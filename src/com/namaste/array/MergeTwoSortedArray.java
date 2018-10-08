package com.namaste.array;

import com.namaste.common.Common;

public class MergeTwoSortedArray {
	
	public static int[] myAnswer(int[] a1,int[] a2) {
		int[] res=new int[a1.length+a2.length];
		int i=0,j=0,k=0;
		int n1=a1.length,n2=a2.length;
		while(true) {
			if(i!=n1&&j!=n2) {
				if(a1[i]<=a2[j])
					res[k++]=a1[i++];
				else res[k++]=a2[j++];
			}else if(i==n1&&j!=n2) {
				res[k++]=a2[j++];
			}else if(i!=n1&&j==n2) {
				res[k++]=a1[i++];
			}else break;
		}
		return res;
	}
	
	public static int[] mergeSortedArray(int[] nums1,int m,int[] nums2,int n) {
        int count=m+n-1;
        --m;--n;
        while(m>=0&&n>=0) nums1[count--]=(nums1[m]>nums2[n])?nums1[m--]:nums2[n--];//nums1数组长度是固定的，count超出长度了
        while(n>=0) nums1[count--]=nums2[n--];
        return nums1;
	}
	
	public static void main(String[] args) {
		int[] a1=new int[] {1,3,5,7,9};
		int[] a2=new int[] {2,6,8};
		int[] res1=myAnswer(a1,a2);
		int[] res2=mergeSortedArray(a1,a1.length,a2,a2.length);
		Common.Print(res1);
		Common.Print(res2);
	}
}
