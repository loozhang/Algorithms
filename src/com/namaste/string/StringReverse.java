package com.namaste.string;

import java.util.Stack;

public class StringReverse {

    //利用StringBuffer的内置reverse方法进行逆序排序

    public static String reverse1(String str) {

        return new StringBuffer(str).reverse().toString();

    }



    //从头部开始,正序:通过字符串数组实现从尾部开始顺序逐个接入字符串reverse
    /*
    使用charAt()方法
     */
    public static String reverse2(String str) {

        String reverse = "";

        for (int i = 0; i < str.length(); i++) {

            reverse = str.charAt(i) + reverse;

        }

        return reverse;

    }



    //从尾部开始,倒序
    /*
    使用toCharArray()方法
     */
    public static String reverse3(String str) {

        char[] arr = str.toCharArray();//String 转换成char数组

        String reverse = "";

        for (int i = arr.length - 1; i >= 0; i--) {

            reverse += arr[i];

        }

        return reverse;

    }



    //利用栈:First In Last Out

    public static String reverse4(String str) {

        StringBuffer sb = new StringBuffer();

        Stack<Character> s = new Stack<Character>();//创建只装字符型的stack

        for (int i = 0; i < str.length(); i++) {

            s.add(str.charAt(i));

        }

        for (int i = 0; i < str.length(); i++) {

            sb.append(s.pop());//出栈，StringBuffer.append()添加到sb的缓冲区末端；.insert(int index,添加的内容)添加到指定位置

        }

        return sb.toString();

    }



    //递归

    public static String reverse5(String str){

        int len=str.length();

        if(len<=1)return str;

        String left=str.substring(0,len/2);

        String right=str.substring(len/2,len);

        return reverse5(left)+reverse5(right);

    }

    public static void main(String[] args) {
        System.out.println(reverse2("abc"));
    }

}
