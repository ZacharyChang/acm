/*
Description
有一头母牛，它每年年初生一头小母牛。每头小母牛从第四个年头开始，每年年初也生一头小母牛。请编程实现在第n年的时候，共有多少头母牛？

Input
输入数据由多个测试实例组成，每个测试实例占一行，包括一个整数n(0<n<55)，n的含义如题目中描述。
n=0表示输入数据的结束，不做处理。

Output
对于每个测试实例，输出在第n年的时候母牛的数量。
每个输出占一行。

Sample Input
2
4
5
0

Sample Output
2
4
6
 */
package contest3;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemM {
    private static int cow[];

    public static void main(String[] args) {
        countCow(56);
        int n;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            if (n == 0) {
                break;
            } else {
                System.out.println(getCount(n));
            }
        }
        scanner.close();
    }

    public static void countCow(int n) {
        cow = new int[n + 1];
        cow[0] = cow[1] = 1;
        cow[2] = 2;
        cow[3] = 3;
        for (int i = 4; i <= n; i++) {
            cow[i] = cow[i - 1] + cow[i - 3];
        }
    }

    public static int getCount(int n) {
        return cow[n];
    }
}
