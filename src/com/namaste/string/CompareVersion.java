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
        System.out.println(compare(v1,v2));
    }

    public static String compare(String v1,String v2){
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
}
