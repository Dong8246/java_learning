package com.dong8246.array;
//给定一个递增有序数组，去除其中的重复元素
public class test3 {
    public static void main(String [] args){
        int [] num = {1,2,2,3,3,4,5,5,6,7,8,9,10};
        /*定义两个指针，遍历数组，如果快慢指针所指数值不同，存到数组中*/
        int slow = 0;
        int fast = 1;
        while(fast < num.length){
            if(num[slow]!=num[fast]){
                slow++;
                num[slow] = num[fast];
            }
            fast++;
        }
        for (int i = 0; i <= slow; i++) {
            System.out.print(num[i] + " ");
        }
    }

}
