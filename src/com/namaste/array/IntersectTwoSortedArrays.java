package com.namaste.array;

import java.util.ArrayList;
import java.util.List;

//https://blog.csdn.net/sinat_20177327/article/details/80100081
//https://blog.csdn.net/qq_41900081/article/details/86531432
public class IntersectTwoSortedArrays {
    public static List intersect(int[] a, int[] b){
        int i=0,j=0,m=a.length,n=b.length;
        List<Integer> res=new ArrayList<>();
        while (i<m&&j<n){
            if(a[i]==b[j]){
                res.add(a[i]);
                i++;
                j++;
            }else if(a[i]>b[j]){
                j++;
            }else {
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = {2,5,6,8,9};
        int b[] = {1,5,6,7,9};
        System.out.println(intersect(a,b));
    }
}
