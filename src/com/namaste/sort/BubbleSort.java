package com.namaste.sort;

//冒泡排序
public class BubbleSort {
    public static void main(String[] args)
    {
        int[] arr=new int[] {3,2,1,7,8,5,3};
        BubbleSortAscEnd(arr);
        BubbleSortAscStart(arr);
        BubbleSortDescEnd(arr);
        BubbleSortDescStart(arr);
        BubbleSortOptimized(arr);
    }

    public static void BubbleSortAscEnd(int[] arr){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        Print(arr);
    }

    public static void BubbleSortAscStart(int[] arr){
        int temp;
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        Print(arr);
    }

    public static void BubbleSortDescEnd(int[] arr){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j]>arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        Print(arr);
    }

    public static void BubbleSortDescStart(int[] arr){
        int temp;
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        Print(arr);
    }

    public static void BubbleSortOptimized(int[] arr){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            boolean flag=false;
            for(int j=arr.length-1;j>i;j--){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
        Print(arr);
    }

    public static void Print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+",");
        }
        System.out.println("-------------------------");
    }
}
