package com.aust.arry;

public class test2 {
    public static void main(String[] args) {
        int[] arr ={1,1,2,2,2,2,3,3,3,3};
        /*去除重复元素，慢指针；存入的位置
                      快指针；找不重复的数据
                相等->舍弃快指针位置的数据
                不等->快指针的数据存入慢指针位置*/
        int slow = 0;
        int fast = 1;
        while(fast<arr.length){
            if(arr[slow]!=arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
                arr[fast]=0;

            }
            else{
                arr[fast] = 0;
            }

                fast++;

        }
        for(int i=0;i<=slow;i++){//只打印去重后的部分，后面被置为0的元素不输出
            System.out.print(arr[i]+" ");
        }
    }
}
