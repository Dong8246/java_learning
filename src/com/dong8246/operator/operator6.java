package com.dong8246.operator;
//运算时的类型转换2.强制转换
public class operator6 {
    public static void main(String[] args){
        short s1 = 100;
        short s2 = 200;
        byte result1 = (byte)(s1 + s2);
        //short + short = int，通过强制转换变成byte，会造成精度丢失
        System.out.println(result1);
        int result2 = s1 + s2;
        System.out.println(result2);
    }
}
