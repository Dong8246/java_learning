package com.dong8246.method;
//练习：定义一个方法，求两个数的和
public class MethodDemo1 {
    public static int getSum(int a,int b){
        return a+b;
    }
    public static void main(String [] args){
        int x = 10;
        int y = 20;
        int sum = getSum(x,y);
        System.out.println(sum);
    }
}
