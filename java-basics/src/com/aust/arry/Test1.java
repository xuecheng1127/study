package com.aust.arry;
import java.util.Random;
public class Test1 {
    //获取10个1到100之间的随机数并存入数组中，要求保证数据是唯一的
    public void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = r.nextInt(101);
            for (int j = 0; j < i; j++)
            {
                if(arr[i] == arr[j])
                {
                    i--;
                    break;
                }
            }
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }


    }
}
