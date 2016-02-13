/*
Description
求Sn=2+22+222+…+22…222（有n个2）的值。 例如：2+22+222+2222+22222（n=5），n由键盘输入。

Input
n

Output
和

Sample Input
5

Sample Output
24690
 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemC {
    private static int sum[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getSum(n));
        scanner.close();
    }

    public static int getSum(int n) {
        sum = new int[n];
        sum[0] = 2;
        int num = 2;
        for (int i = 1; i < n; i++) {
            num += 2 * Math.pow(10, i);
            sum[i] = sum[i - 1] + num;
        }
        return sum[n - 1];
    }
}
