package com.dong8246.algorithm;
//算法练习：键盘录入一个数组和一个值，要求删除数组中所有等于该值的元素并输出改动后的数组
import java.util.Scanner;
public class algorithmDemo1 {
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int n = sc.nextInt();
        int[]num = new int[n];
        System.out.println("请输入数组元素：");
        for(int i = 0;i<n;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("请输入要删除的元素：");
        int x = sc.nextInt();
        int slow  = 0;
        int fast = 0;
        while(fast<n){
            if(num[fast]!=x){
                num[slow] = num[fast];
                slow++;
            }
            fast++;
        }
        for(int i = 0;i<slow;i++){
            System.out.print(num[i] + " ");
        }
        }
    }

