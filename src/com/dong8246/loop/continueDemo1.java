package com.dong8246.loop;
//continue练习：循环打印1-100，每逢7的倍数或者含7的数字，打印“过”
public class continueDemo1 {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++) {
            if(i%10==7||i/10%10==7||i%7==0){
                System.out.println("过");
                continue;
            }
                System.out.println(i);
        }
    }
}
