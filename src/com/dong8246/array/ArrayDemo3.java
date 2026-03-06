package com.dong8246.array;
//数组动态初始化：键盘录入5个整数，并进行遍历输出
import java.util.Scanner;
public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
        for (int j = 0; j < num.length; j++) {
            System.out.println(num[j]);
            System.out.println(num[5]);
        }
    }
}
