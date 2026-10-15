package com.aust.arry;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        /*给定一个递增的有序数组和一个目标值，在数组中找到目标值，打印其索引/
        如果目标不在这个数组中，打印应插入的位置*/
        System.out.println("请输入一个目标值：");
        int[] nums = {1, 5, 9, 10};
        int j=0;
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                System.out.println("找到目标值了，索引为" + i);
                flag = true;

            }
            if (flag == true)
                break;

        }

        if (flag == false) {

            for (j = 0; j < nums.length; ) {
                if (nums[j] < target)
                    j++;
                else break;
            }
            System.out.println("目标值不在数组中，应插入的位置为" + j);
        }




    }
}
