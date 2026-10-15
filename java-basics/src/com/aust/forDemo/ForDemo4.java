package com.aust.forDemo;
import java.util.Scanner;
public class ForDemo4 {
    public static void main(String[] args) {
       /* 计算一下数列前n项的和
                S（n）=1-2+3-4+5*/
        System.out.println("请输入n的值：");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a=1;
       int b=2;
       int sum=0;
       for(int i=1;i<=n;i++){
           if(i%2==1){
               sum+=a;
           }else{
               sum-=b;
           }
       }
       System.out.println("数列前"+n+"项的和为："+sum);
    }
}
