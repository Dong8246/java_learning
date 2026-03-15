package com.dong8246.method;
//方法练习1：5个评委打分，分数在0~100之间，去掉最低分和最高分，求最终平均分
/*要求：
* 1.利用键盘录入5个整数存入数组当中，分数超出范围则重新录入
* 2. 定义方法分别求出数组的最大值和最小值
* 3，计算5名评委的总分
* 4. 总分减去最大值和最小值，求选手最终平均分
* */
import java.util.Scanner;
public class test1 {
    public static int getmax(int [] arr){
        int max = arr[0];
        for(int i = 1;i< arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static int getmin(int [] arr){
        int min = arr[0];
        for(int i = 1;i< arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        int [] num = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<num.length;i++){
            int score  = sc.nextInt();
            if(score>=0&&score<=100){
                num[i] = score;
            }else{
                System.out.println("输入的分数有误，请重新输入");
                i--;
            }

        }
        int max = getmax(num);
        int min = getmin(num);
        int sum = 0;
        for(int i = 0;i<num.length;i++){
            sum += num[i];
        }
        System.out.println("最终得分为："+(sum-max-min)/3);
    }
}




















