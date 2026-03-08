package com.dong8246.array;
//已知一个数组{1，2，3，4，5，6，7，8，9，10}，随机排序这个数组的数据
import java.util.Random;
public class test1 {
    public static void main(String [] args){
        int [] num = {1,2,3,4,5,6,7,8,9,10};
        Random r = new Random();
        for(int i = 0;i<num.length;i++){
            int index =r.nextInt(num.length);
            int temp = num[i];
            num[i] = num[index];
            num[index] = temp;
        }
        for(int i = 0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
