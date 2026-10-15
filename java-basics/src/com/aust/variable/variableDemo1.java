package com.aust.variable;

public class variableDemo1 {
    public static void main(String[] args){
        /*微信余额：100元
        支付宝余额：10元
        银行卡余额：20元
        问题一：请问现在一共有多少钱
        问题二，微信收了十元红包，又发了两元红包，余额多少？     */
        double wechat = 100;
        double alipay = 10;
        double bank = 20;
        System.out.println("现在一共有多少钱：" + (wechat + alipay + bank) + "元");
        wechat = wechat + 10 - 2;
        System.out.println("微信余额：" + wechat + "元");
    }
}
