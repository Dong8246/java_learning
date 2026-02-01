package com.dong8246.Switch;
//switch选择语句，用switch新语法，读取运算符并进行运算
import java.util.Scanner;
public class switchDemo4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("请输入运算符");
        char c = sc.next().charAt(0);
            double result = switch(c){
    case '+' -> { yield a+b; }
    case '-' -> { yield a-b; }
    case '*' -> { yield a*b; }
    case '/' -> { yield a/b; }
    default -> { yield 0; }
};
        System.out.println(result);
    }
}
