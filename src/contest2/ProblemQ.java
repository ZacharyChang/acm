/*
Description
2020年wh和cf在上海和平饭店约着吃饭，饭后买单的时候，俩人都抢着买单，谁也不让谁，僵持之下，俩人决定以ACMer的方法解决争端。
俩人决定以捡石头游戏来决定谁有买单权。没办法，俩人都壕！
游戏规则：有一堆石子一共有n个，两人轮流进行，每走一步可以取走1…m个石子，最先取光石子的一方为胜。wh先取。
首先输入一个T，表示一共有T组数据，每组输入俩个整数n和m，对于每组数据，输出赢得买单权的名字。

Input
首先是一个T，代表有n组数据。

接下来每行有一个n和一个m（1<=n,m<=1000000000）

Output
每组输出一行，如果cf胜输出“cf”，否则输出“wh”

Sample Input
2
23 2
4 3

Sample Output
wh
cf
 */
package contest2;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            result(n, m);
        }
    }

    public static void result(int n, int m) {
        if (n % (m + 1) == 0) {
            System.out.println("cf");
        } else {
            System.out.println("wh");
        }
    }
}
