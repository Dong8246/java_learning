package com.dong8246.variable;
//计算BMI：体重/身高的平方

import java.util.Scanner;
public class variable5 {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("请输入体重：");
    double weight = sc.nextDouble();
    System.out.println("请输入身高：");
    double height = sc.nextDouble();
    double bmi = weight/(height*height);
    System.out.println("BMI="+bmi);

    }
}
