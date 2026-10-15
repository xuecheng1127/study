package com.aust.method;

public class methodDemo7 {
    public static void main(String[] args) {
        sum(10);
        sum(10, 20);
        sum(10, 20, 30);
        sum(10, 20, 30, 40);
    }
    //方法的重载
    //可以给多个方法取同一个名字，只要它们的参数列表不同即可
    public static void sum(int a) {
        System.out.println(a);
    }
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }
    public static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public static void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
    //同一个方法，方法名相同，参数不同的方法，无需看返回值
    //方法重载必须在同一个类中，不能在不同类中定义相同参数列表的方法
    //方法重载不看返回值类型

    //如果形参和实参的类型不同，那么会发生隐式转换

}
