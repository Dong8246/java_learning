package com.dong8246.operator;
//键盘输入并求和：输入两个整数类型变量并求和，输出求和后的结果

public class operator1 {
    public static void main(String[] args){
        java.util.Scanner sc  = new java.util.Scanner(System.in);
        System.out.println("请输入两个整数：");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("两个整数的和为：");
        System.out.println(num1+num2);
    }
}
