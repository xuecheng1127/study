package com.aust.arry;

import java.util.Random;

public class arryDemo10 {
    public void main(String[] args) {
        //获取十个一到一百的随机数并存入到数组中，要求保证数据是唯一的
        Random r=new Random();
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=r.nextInt(100)+1;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    i--;
                    break;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }


}
