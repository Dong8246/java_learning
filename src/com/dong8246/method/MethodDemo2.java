package com.dong8246.method;
//定义方法，遍历并输出一个数组
public class MethodDemo2 {
    public static void printArray(int [] num){
        for(int i = 0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String [] args){
        int [] num = {1,2,3,4,5,6,7,8,9,10};
        printArray(num);
    }
}
