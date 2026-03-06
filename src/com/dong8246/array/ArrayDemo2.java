package com.dong8246.array;
//初始化数组，获取数组长度，并进行遍历查找修改操作
public class ArrayDemo2 {
    public static void main(String [] args){
        int [] ages = {18,19,20};
        System.out.println("数组的长度是");
        System.out.println(ages.length);
        for(int i = 0;i<=2;i++){
            System.out.println(ages[i]);
        }
        ages[0] = ages[0]+1;
        ages[1] = ages[1]+1;
        ages[2] = ages[2]+1;
        for(int i = 0;i<=2;i++){
            System.out.println(ages[i]);
        }
    }
}
