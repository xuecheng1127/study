package com.aust.whileDemo;

public class WhileDemo3 {
    public static void main(String[] args) {
      /*假如你再银行投资了十万元，银行给出的复利是百分之一点七，问多少年后能实现资金翻倍
                该用什么循环？*/
        double mon=100000;
        int year=0;
        while(mon<200000){
            mon=mon+mon*0.017;
            year++;
        }
        System.out.println("要"+year+"年"+"才能实现资金翻倍");
    }
}
