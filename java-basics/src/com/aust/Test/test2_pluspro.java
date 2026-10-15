package com.aust.Test;

import java.util.Random;

public class test2_pluspro {

    public class RedPacket {
        public static void main(String[] args) {
            int M = 100;    // 总额
            int N = 10;     // 人数
            Random r = new Random();

            // 第 1 步：在 [1, 99] 之间随机选 9 个不重复的数（隔板位置）
            int[] cuts = new int[N - 1];
            for (int i = 0; i < N - 1; i++) {
                int num;
                do {
                    num = r.nextInt(M - 1) + 1;   // [1, 99]
                } while (contains(cuts, i, num)); // 重复就重抽
                cuts[i] = num;
            }

            // 第 2 步：冒泡排序（你学过的）
            for (int i = 0; i < cuts.length - 1; i++) {
                for (int j = 0; j < cuts.length - 1 - i; j++) {
                    if (cuts[j] > cuts[j + 1]) {
                        int temp = cuts[j];
                        cuts[j] = cuts[j + 1];
                        cuts[j + 1] = temp;
                    }
                }
            }

            // 第 3 步：按隔板切分金额
            int prev = 0;
            for (int i = 0; i < N; i++) {
                int money;
                if (i < N - 1) {
                    money = cuts[i] - prev;
                    prev = cuts[i];
                } else {
                    money = M - prev;
                }
                System.out.println("第" + (i + 1) + "个人红包金额为：" + money + "元");
            }
        }

        // 检查数组前 len 个元素里有没有 num
        public static boolean contains(int[] arr, int len, int num) {
            for (int i = 0; i < len; i++) {
                if (arr[i] == num) {
                    return true;
                }
            }
            return false;
        }
    }

}
//待理解
