package com.aust.variable;

public class variableDemo2 {
    public static void main(String[] args) {
        /*我方：叉子      对手：长矛
        攻击：220       攻击：210
        防御：85        防御：80
        血量：1012.5    血量：1222.3
        技能加成：1.2   技能加成：1/3

        技能造成伤害的公式：攻击力*技能加成-防御力
        普攻造成伤害的公式：攻击力-防御力
        计算：我方第一次进行技能攻击，造成多少伤害，对方剩多少血量
        计算：我方第二次进行普通攻击，造成多少伤害，对方剩多少血量

        经常发生改变的数据，用变量记录        */

        double myAttack = 220;
        double myDefense = 85;
        double myBlood = 1012.5;
        double mySkillAttack = 1.2;

        double enemyAttack = 210;
        double enemyDefense = 80;
        double enemyBlood = 1222.3;
        double skillAttackDamage = myAttack * mySkillAttack - enemyDefense;
        double enemyBloodAfterSkillAttack = enemyBlood - skillAttackDamage;

        double normalAttackDamage = myAttack - enemyDefense;
        double enemyBloodAfterNormalAttack = enemyBloodAfterSkillAttack - normalAttackDamage;

        System.out.println("我方第一次进行技能攻击，造成多少伤害：" + skillAttackDamage);
        System.out.println("对方剩多少血量：" + enemyBloodAfterSkillAttack);
        System.out.println("我方第二次进行普通攻击，造成多少伤害：" + normalAttackDamage);
        System.out.println("对方剩多少血量：" + enemyBloodAfterNormalAttack);
    }
}
