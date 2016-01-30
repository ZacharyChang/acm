/*
Description
编写一个程序，输入a、b、c三个值，输出其中最大值。

Input
一行数据，分别为a b c (|a|, |b|, |c| < 100)

Output
a b c其中最大的数

Sample Input
10 20 30

Sample Output
30
 */
package contest2;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemC {
    public static void main(String[] args) {
        int max, a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println(max(a, b, c));
    }

    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
