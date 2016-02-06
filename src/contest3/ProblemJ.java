/*
Description
小明今年3岁了, 现在他已经能够认识100以内的非负整数, 并且能够进行100以内的非负整数的加法计算.
对于大于等于100的整数, 小明仅保留该数的最后两位进行计算, 如果计算结果大于等于100, 那么小明也仅保留计算结果的最后两位.

例如, 对于小明来说:
1) 1234和34是相等的
2) 35+80=15

给定非负整数A和B, 你的任务是代表小明计算出A+B的值.

Input
输入数据的第一行为一个正整数T, 表示测试数据的组数. 然后是T组测试数据. 每组测试数据包含两个非负整数A和B

Output
对于每组测试数据, 输出小明A+B的结果.

Sample Input
2
35 80
15 1152

Sample Output
15
67

HINT
注意用 long long
 */
package contest3;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str1, str2;
        for (int i = 0; i < n; i++) {
            str1 = scanner.next();
            str2 = scanner.next();
            result(str1, str2);
        }
    }

    public static void result(String str1, String str2) {
        String result;
        int a, b, x, y;
        if (str1.length() > 1) {
            a = Integer.parseInt(String.valueOf(str1.charAt(str1.length() - 2)));
        } else {
            a = 0;
        }
        if (str2.length() > 1) {
            x = Integer.parseInt(String.valueOf(str2.charAt(str2.length() - 2)));
        } else {
            x = 0;
        }
        b = Integer.parseInt(String.valueOf(str1.charAt(str1.length() - 1)));
        y = Integer.parseInt(String.valueOf(str2.charAt(str2.length() - 1)));
        if (str2.startsWith("-")) {
            result = String.valueOf((a - x) * 10 + b - y);
        } else {
            result = String.valueOf((a + x) * 10 + b + y);
        }
        if (result.length() > 2) {
            result = result.charAt(1) + "" + result.charAt(2);
        }
        System.out.println(Integer.parseInt(result));
    }
}
