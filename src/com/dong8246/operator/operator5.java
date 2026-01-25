package com.dong8246.operator;
//运算时的类型转换1.隐式转换
public class operator5 {
    public static void main(String[] args){
    byte a = 100;
    short b = 200;
    double c = 20.3;
    double result = a + b + c;
    /*运算时的类型转换情况：
    * 1.a + b  隐式转换时，先把byte和short类型的数据转换为int类型
    * a + b结果是300(int)
    *
    * 2.300(int) + c
    * 300(int) + 20.3(double)  隐式转换时，先把int转换为double类型
    *  结果是320.3(double)
    */
    System.out.println(result);
    }
}
