/*
Description
写两个函数，分别求两个整数的最大公约数和最小公倍数，用主函数调用这两个函数，并输出结果两个整数由键盘输入。
Input
两个数
Output
最大公约数 最小公倍数
Sample Input
6 15

Sample Output
3 30
 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemQ {
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
