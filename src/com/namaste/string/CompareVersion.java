package com.namaste.string;

/*
输入两个版本号做大小比较
1）
1.2.3_1212
1.2.3_12
2)
1.2.3_1212
1.2.3_1214
3)
1.2
1.2.2
 */
public class CompareVersion {
    public static void main(String[] args) {
        //String v1="1.2.3_1212";
        //String v2="1.2.3_12";

        //String v1="1.2.3_1212";
        //String v2="1.2.3_1214";

        String v1="1.2";
        String v2="1.2.2";
        System.out.println(compare2(v1,v2));
    }

    /*
    my solution:可以符合标题处的题目要求，但不符合leetcode相似问题165的要求
     */
    public static String compare1(String v1,String v2){
        int i=0;
        if(v1.length()!=v2.length()){
            return v1.length()>v2.length()?v1:v2;
        }else{
            while(i<v1.length()){
                if(v1.charAt(i)==v2.charAt(i)){i++;}
                else{
                    return v1.charAt(i)>v2.charAt(i)?v1:v2;
                }
            }
        }
        return "";
    }

    /*
    可以解leetcode165，核心思想是每次对应取出相同位置的小数点之前所有的字符，把他们转为数字比较，若不同则可直接得到答案，若相同，再对应往下取。如果一个数字已经没有小数点了，则默认取出为0，和另一个比较，这样也解决了末尾无效0的情况
    https://www.cnblogs.com/grandyang/p/4244123.html
     */
    public static int compare2(String v1,String v2){
        int n1=v1.length(),n2=v2.length();
        int i=0,j=0,d1=0,d2=0;
        while (i<n1||j<n2){
            while (i<n1&&v1.charAt(i)!='.'){
                d1=d1*10+v1.charAt(i++)-'0';
            }
            while (j<n2&&v2.charAt(j)!='.'){
                d2=d2*10+v2.charAt(j++)-'0';
            }
            if(d1>d2){
                return 1;
            }else if(d1<d2){
                return -1;
            }
            d1=d2=0;
            i++;
            j++;
        }
        return 0;
    }
}
