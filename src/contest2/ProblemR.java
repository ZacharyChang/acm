/*
Description
编写一个算法，其功能是给一维数组a输入任意6个整数，假设为5,7,4,8,9,1，
然后打印出如下矩阵：
5 7 4 8 9 1
1 5 7 4 8 9
9 1 5 7 4 8
8 9 1 5 7 4
4 8 9 1 5 7
7 4 8 9 1 5

Input
题目包含多组数据，每组数据包含6个整数，每两个数之间用空格隔开。

Output
每组按要求输出一个矩阵，每组输出后打印一个空行。

Sample Input
5 7 4 8 9 1

Sample Output
5 7 4 8 9 1
1 5 7 4 8 9
9 1 5 7 4 8
8 9 1 5 7 4
4 8 9 1 5 7
7 4 8 9 1 5
 */
package contest2;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n[] = new int[6];
        while (scanner.hasNext()) {
            for (int i = 0; i < 6; i++) {
                n[i] = scanner.nextInt();
            }
            printArray(n);
        }
        scanner.close();
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                System.out.print(array[(j - i + array.length) % array.length] + " ");
            }
            System.out.println(array[(array.length - i - 1) % array.length]);
        }
        System.out.println();
    }
}
