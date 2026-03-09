package com.dong8246.array;
//获取10个1~100的随机整数，要求随机整数不能重复
import java.util.Random;
public class test2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] num = new int[10];
        for (int i = 0; i < num.length; ) {
            int index = r.nextInt(100) + 1;
            int count = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[j] == index) {
                    count++;
                    break;
                }
            }
             if (count == 0) {
                num[i] = index;
                i++;
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}