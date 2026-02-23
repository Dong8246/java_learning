package com.dong8246.loop;
//用随机数生成1-100的数字，然后用户输入数字，进行对比并输出结果
import java.util.Random;
import java.util.Scanner;
public class Randomloop1 {
    public static void main(String[] args){
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        System.out.println(num);
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数字：");
            int n = sc.nextInt();
            if(n > num){
                System.out.println("你输入的数字太大了");
            }else if(n < num){
                System.out.println("你输入的数字太小了");
            }else{
                System.out.println("恭喜你，你输入的数字是正确的");
                break;
            }
        }
    }
}
