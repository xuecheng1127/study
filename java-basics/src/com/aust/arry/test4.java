package com.aust.arry;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //给定一个整数数组nums,键盘录入target，请你在该数组中找出和为目标target的那两个整数并输出索引
        int[] nums = {2, 7, 11, 15,1,8,9,10,11,12,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入目标值target：");
        int target = scanner.nextInt();
        //只要输出第一对满足的情况
        int i;
        int j = 0;
        int temp=0;
        int count=0;
        
        for (i = 0; i <= nums.length - 1; i++) {
            for (j = 1; j <= nums.length - 1; j++)
                if (nums[i] + nums[j] == target) {
                    System.out.println("这两个数为" + nums[i] + "," + nums[j]);
                    System.out.println("索引为" + i + "," + j);
                    count++;

                }
            if (count==1)break;
            temp++;
        }
        if(temp==4) System.out.println("没有找到");
        else System.out.println("找到了");

        //输出所有满足要求的情况（j从i+1开始，避免(2,8)和(8,2)这种重复配对）
        boolean found = false;
        for (i = 0; i <= nums.length - 1; i++) {
            for (j = i + 1; j <= nums.length - 1; j++)
                if (nums[i] + nums[j] == target) {
                    System.out.println("这两个数为" + nums[i] + "," + nums[j]);
                    System.out.println("索引为" + i + "," + j);
                    found = true;
                }
        }
        if (!found) System.out.println("没有找到");
        else System.out.println("找到了");

    }
}
