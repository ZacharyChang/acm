/*
Description
求Sn=1!+2!+3!+4!+5!+…+n!之值，其中n是一个数字。

Input
n(0 <= n <= 20)

Output
和

Sample Input
5

Sample Output
153

HINT
 use the type "long long" may help you.
 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemD {
    private static long sum[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getSum(n));
        scanner.close();
    }

    public static long getSum(int n) {
        sum = new long[n + 1];
        sum[0] = 0L;
        long factorial = 1L;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum[i] = sum[i - 1] + factorial;
        }
        return sum[n];
    }
}
