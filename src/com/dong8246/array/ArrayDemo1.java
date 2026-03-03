package com.dong8246.array;
//数组的静态初始化:定义数组初始化三个同学的年龄、身高和名字
public class ArrayDemo1 {
    public static  void main(String [] args){
        /*静态初始化
        * 简写格式：数据类型[] 数组名 = {元素1,元素2,元素3...};
        * 完整格式：数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3...};
        * */
        int [] ages = {18,19,20};
        double [] heights = {1.68,1.70,1.75};
        String [] name = {"张三","李四","王五"};
        System.out.println(ages[0]);
        System.out.println(heights[0]);
        System.out.println(name[0]);
    }
}
