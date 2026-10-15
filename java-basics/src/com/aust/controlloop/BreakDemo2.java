package com.aust.controlloop;

import java.util.Scanner;

public class BreakDemo2 {
    public static void main(String[] args) {
        /*游戏人物的血条为200，受到x点伤害，技能回复y点血，x和y由键盘录入
                假设游戏人物不会死亡，最少一点血
                请问最终人物血量为多少*/
        System.out.println("请输入受到的伤害");
        System.out.println("请输入技能回复的血量");
        int blood=200;
        int x, y;
        while(true){
            Scanner sc=new Scanner(System.in);
            x=sc.nextInt();
            y=sc.nextInt();
            if (x>0&&y>0) break;
            System.out.println("请输入受到的正确伤害");
            System.out.println("请输入技能回复的正确血量");


        }
        blood=blood-x+y;
        if(blood<1)
            blood=1;
        System.out.println("最终人物血量为"+blood);

    }
        //人物血量最少为一点

    }
