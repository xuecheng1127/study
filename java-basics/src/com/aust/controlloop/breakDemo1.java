package com.aust.controlloop;

public class breakDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        //break不能单独出现，只能卸载switch和循环结构中，表示结束当前循环结构，其后代码不会在实现运行

    }
}
