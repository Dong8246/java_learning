package com.dong8246.method;
//定义一个方法，打印九九乘法表
public class MethodDemo3 {
   static void printable(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        printable();
    }
}
