package com.dong8246.operator;
//实现字母的大小写转换：在ASCII中，大写字母的ASCII码比小写字母的ASCII码小32
//也可以使用函数进行转换
public class operator7 {
    public static void main(String[] args){
        char c = 'A';
        char cc = (char) (c + 32);
        System.out.println("得到的字符是" + cc);

    }
}
