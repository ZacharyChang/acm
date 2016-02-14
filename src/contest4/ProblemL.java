/*
Description
用筛法求之N内的素数。

Input
N (0 < N <= 150)

Output
0～N的素数

Sample Input
100

Sample Output
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97

HINT
数组大小动态定义？函数？
 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printPrimeNumbers(num);
        scanner.close();
    }

    public static void printPrimeNumbers(int limit) {
        prime:
        for (int i = 2; i <= limit; i++) {
            for (int j = 2; j < (i / 2 + 1); j++) {
                if (i % j == 0) {
                    continue prime;
                }
            }
            System.out.println(i);
        }
    }
}
