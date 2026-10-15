package com.aust.controlloop;
//导入Scanner类
import java.util.Scanner;
//定位随机数生成
import java.util.Random;
public class BreakDemo {
    //生成一百到一之间的随机数，利用键盘录入模拟猜的动作，一直猜，知道猜中为止
    //添加小保底机制，如果三次都没猜中，提示范围
    //增加大保底机制，如果十次都没猜中，提示答案


    public static void main(String[] args) {
        int countA = 0;
        int countB = 0;
        Random r = new Random();
        int num = r.nextInt(1, 101);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的猜测：");
            int guess = sc.nextInt();
            countA++;
            countB++;
            //大保底机制
            if ( countB == 10) {
                System.out.println("答案为：" + num);
                break;
            }
            if (guess > num) {
                System.out.println("太大了");

            } else if (guess < num) {
                System.out.println("太小了");

            } else {
                System.out.println("恭喜你，猜对了");
                break;
            }


            //添加小保底机制
            if (countA % 3 == 0) {
                System.out.println("提示：答案在" +(num-5) + "到" + (num+5) + "之间");
            }
        }
    }
}






