package com.aust.ifDemo;
import java.util.Scanner;

public class siwtchDemo {
    public static void main(String[] args) {
        /*根据月份判断季节
        1-3春 4-6夏 7-9秋 10-12冬
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("春天");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏天");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋天");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
