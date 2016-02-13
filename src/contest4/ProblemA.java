/*
Description
输入两个正整数m和n，求其最大公约数和最小公倍数。
Input
两个整数
Output
最大公约数，最小公倍数
Sample Input
5 7

Sample Output
1 35
 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(maxCommonDivisor(n, m) + " " + minCommonMultiple(n, m));
    }

    // 循环法求最大公约数
    public static int maxCommonDivisor(int n, int m) {
        if (m < n) {    // 保证m>n,若m<n,则进行数据交换
            int temp = m;
            m = n;
            n = temp;
        }
        while (m % n != 0) {    // 在余数不能为0时,进行循环
            int temp = m % n;
            m = n;
            n = temp;
        }
        return n;   // 返回最大公约数
    }

    // 求最小公倍数
    public static int minCommonMultiple(int n, int m) {
        return m * n / maxCommonDivisor(n, m);
    }
}
