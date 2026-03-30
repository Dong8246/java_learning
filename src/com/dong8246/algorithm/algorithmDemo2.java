package com.dong8246.algorithm;
/*
算法练习：分红包，给出两个整数m和n，m表示红包总额，n表示红包的个数
现在又n个人来分红包，每个人都是随机的，打印每个人领的红包金额
要求：每个人最少一分钱；每个人领完红包后，至少预留1*n分钱；最后一个人拿剩余的总额
*/
import java.util.Scanner;
import java.util.Random;
public class algorithmDemo2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int n = sc.nextInt();
        Random r = new Random();
        if(money<n){
            System.out.println("输入金额不足");
        }else{
            for (int i = 1; i < n; i++) {
                int mymoney = r.nextInt(money-(n-i)) + 1;
                money = money - mymoney;
                System.out.println("第" + i + "个人抢到" + mymoney + "分");
            }
            System.out.println("第" + n + "个人抢到" + money + "分");
        }
        }

}
