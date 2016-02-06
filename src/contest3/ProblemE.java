/*
Description
计算中心有8个机房，每个机房有n台电脑。每台电脑都有一个编号，比如8号机房编号就为H1到Hn，我们有时又称为H1为1号机器，H2为2号机器,...。
有一天我们学校跻身世界高校100强，全校所有师生都进行了狂欢庆祝。罗老师是个很爽快的人，也很喜欢喝酒，那天他喝多了点。但不巧的是那天晚上正好罗老师值班，罗老师是个很负责的老师。所以他就把8号机房打开了。但同学们都还在狂欢，没一个人来上机。罗老师提着一瓶酒，感觉到很无聊，所以他想玩个游戏。
第一回合，他喝了一口酒，他把所有的电脑都打开。然后第二回合他喝了一口酒，他把编号是2，4，6,...的电脑全关了。第三回合，他喝一口酒后就去操作所有编号是3，6，9，...,看到电脑开着就把它关掉，看到电脑关了就把它打开。他重复这样操作共进行了n个回合。当他操作完最后一个回合后，罗老师醉倒了。
现在给你这个机房电脑的数目，问你最后共有几台电脑开着？

Input
多组数据测试。﻿

输入只有1行，这行有一个正整数，表示这个机房共有多少个电脑，该数是5到100之间的任意正整数。

Output
你必须输出最后开着的电脑数。输出该数后不要忘了换行

Sample Input
5

Sample Output
2

HINT

 for(i=1;i<=n;i++)//i表示回合1--n

for(k=1;k<=n;k++)//k表示电脑编号1--n


 */
package contest3;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            System.out.println(result(n));
        }
    }

    public static int result(int n) {
        return (int) Math.sqrt(n);
    }
}
