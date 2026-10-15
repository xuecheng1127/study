package com.aust.variable;

public class variableDemo4 {
    /*整数：byte short int long
           1    2    4     8
    小数：float double
           4    8
    字符：char
           2
    布尔：boolean
         1*/
    public static void main(String[] args) {
            /*变量的定义格式
            * 数据类型+变量名=数据值*/
        byte b=127;
        System.out.println(b);
        short s=32767;
        System.out.println(s);
        int i=2147483647;
        System.out.println(i);
        long l=9223372036854775807L;
        //long类型数据后加L
        System.out.println(l);
        float f=3.14f;
        //float类型后面要加f或者F
        System.out.println(f);
        double d=3.141592653589793;
        System.out.println(d);
        char c='a';
        System.out.println(c);
        boolean g=true;
        System.out.println(g);
        char c1='中';
        System.out.println(c1);
    }
}
