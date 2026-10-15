package com.aust.method;

public class methodDemo1 {
    public static void main(String[] args) {
        int result = Getsum(10, 20);
        System.out.println(result);
    }
    public static int Getsum(int a, int b) {
        return a + b;
    }
    /*方法格式
            public static 返回值类型 方法名(参数1，参数2)、
                                            形式参数
                                            调用时为实际参数
    {
        方法体；
        return 返回值 1.结束方法运行
                     2.把结果返回给方法的调用出
        注意点：
               1.方法跟方法之间是平级关系，不能相互嵌套
               2.方法不会主动运行，需要被调用才能使用
               3.小括号中的参数要一一对应，个数和类型都必须相同

               main为程序的入口，程序从这里开始运行

        1.什么是方法
        方法是一段可以重复使用的代码块，方法的定义可以理解为代码的模板，方法的调用可以理解为代码的执行
        2.方法的使用场景
        把程序中经常使用的独立功能打包起来，放在方法当中
        3.方法的好处
        提高代码的复用性和可维护性
    }*/

}
