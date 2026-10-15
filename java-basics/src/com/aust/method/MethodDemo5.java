package com.aust.method;

public class MethodDemo5 {
    public void main(String[] args) {
        printMultiplicationTable();


    }
    //定义方法打印九九乘法表
    public void printMultiplicationTable() {
        for(int i=1;i<=9;i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + "x" + i + "=" + i * j + "\t");
            System.out.println();
        }
        //没有参数的方法可以直接运行
        //无需继续使用结果就可以直接用void
    }
}
