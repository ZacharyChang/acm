/*
Description
输入一个正整数n（n<=10),计算
S=1!+2!+3!+...+n!

Input
输入一个正整数n（n<=10)（多组数据）

Output
输出S（每组数据一行）

Sample Input
2

Sample Output
3
 */
package contest2;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            System.out.println(sum(num));
        }
        scanner.close();
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        return sum;
    }
}
