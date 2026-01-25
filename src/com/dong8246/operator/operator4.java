package com.dong8246.operator;
//时间转换，把秒数转化为时、分、秒并输出
import java.util.Scanner;
public class operator4 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int hour = num/3600;
        int minute = num%3600/60;
        int second = num%60;
        System.out.println(hour+"时"+minute+"分"+second+"秒");

    }
}
