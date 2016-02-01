/*
Description
某国王大赦囚犯，让一狱吏n次通过一排锁着的n间牢房，每通过一次，按所定规则转动n间牢房的某些门锁，每转动一次，原来锁着的门被打开，原来打开的门被锁上，通过n次后，门开着的，牢房中的犯人放出，否则犯人不得释放。

转动门锁的规则是这样的，第一次通过牢房，从第1间开始要转动每一把门锁，即把全部的锁打开；第2次通过牢房时，从第2间开始转动，每隔一间转动一次；......；第k次通过牢房时，从第k间开始转动，每隔k-1间转动一次；问通过n次后，哪些牢房的锁是打开的？

Input
题目包含多组数据，每组数据包含一个整数n，n不超过1000000，牢房编号从1开始。不超过100组样例。

Output
每组要求输出锁是开着的牢房个数，并输出牢房的编号。

Sample Input
5

Sample Output
2
1 4

 */
package contest2;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double num = scanner.nextDouble();
            int sqrt = (int) Math.sqrt(num);
            result(sqrt);
        }
        scanner.close();
    }

    public static void result(int n) {
        System.out.println(n);
        for (int i = 1; i < n; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println(n * n);
    }
}
