package com.aust.method;

public class methodDemo6 {
    /*
           给定两个长方形，判断哪个长方形面积更大？
           如何定义方法
     */
    public static void main(String[] args) {
        String result=compareArea(120,20,80,30);
        System.out.println(result);

    }
    public static String compareArea(double length1, double width1, double length2, double  width2) {
        double area1 = length1 * width1;
        double area2 = length2 * width2;
        if (area1 > area2) {
            return "长方形1更大";
        } else if (area1 < area2)
        {
            return "长方形2更大";
        } else {
            return "两个长方形面积相等";
        }
    }
}
