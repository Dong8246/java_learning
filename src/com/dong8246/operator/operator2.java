package com.dong8246.operator;
//运算符的计算
public class operator2 {
    public static void main(String[] args){
        //整数之间的运算
        int a = 10;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        //整数相除结果是整数，结果小数部分会被截掉
        System.out.println(a/b);
        System.out.println(a%b);
        //浮点数之间的运算
        double c = 10.0;
        double d = 3.0;
        System.out.println(c+d);
        System.out.println(c-d);
        System.out.println(c*d);
        //小数计算有可能不准确，结果会损失精度
        System.out.println(c/d);
        System.out.println(c%d);
    }
}
