package com.aust.Test;
import java.util.Random;

public class test2_plus {
    public static void main(String[] args) {
        int M = 100;       // 总额
        int N = 10;        // 人数
        Random r = new Random();
        int remain = M;    // 剩余金额

        for (int i = 1; i <= N; i++) {
            if (i == N) {
                // 最后一个人直接拿剩余的全部
                System.out.println("第" + i + "个人红包金额为：" + remain + "元");
                break;
            }

            // 关键：这次最多能拿多少？
            // 还剩 (N - i + 1) 个人，人均 = remain / 人数
            // 随机上限 = 人均 × 2，这样前后期望差不多
            int peopleLeft = N - i + 1;          // 包括自己在内还剩几个人
            int avg = remain / peopleLeft;       // 人均
            int max = avg * 2;                  // 这次随机上限
            // 再保险一下：不能超过"剩下的钱减去后面每个人保底 1 元"
            if (max > remain - (N - i)) {
                max = remain - (N - i);
            }

            int money = r.nextInt(max) + 1;     // [1, max] 之间随机
            System.out.println("第" + i + "个人红包金额为：" + money + "元");
            remain -= money;
        }
    }

}
