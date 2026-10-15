package com.aust.Test;

public class test1 {
    public static void main(String[] args) {
        int[] nums={12,2,3,4,53,6,7,2,9,10};
        int val=2;
        removeElement(nums,val);
    }
    /*
    给你一个数组nums和一个值val，你需要删除所有数值等于val的元素并形成一个新的数组，返回新数组
     */
    public static void removeElement(int[] nums, int val) {
        int slow=0;
        int fast=0;
        while (fast<nums.length){
            if (nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;}
            fast++;

        }
        for(int i=slow;i< nums.length;i++)
        {
            nums[i]=0;
        }
        System.out.println("新数组为：");
        for(int i=0;i<slow;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println("有效个数为"+slow);

    }
}






