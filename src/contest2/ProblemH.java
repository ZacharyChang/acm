/*
Description
输入一个正整数n,计算它的阶乘

Input
输入一个正整数n（n<=10)（多组数据）

Output
输出n的阶乘（每组数据一行）

Sample Input
3

Sample Output
6
 */
package contest2;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            System.out.println(factorial(num));
        }
        scanner.close();
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
