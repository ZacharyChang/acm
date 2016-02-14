/*
Description
有一分数序列： 2/1 3/2 5/3 8/5 13/8 21/13...... 求出这个数列的前N项之和，保留两位小数。
Input
N
Output
数列前N项和
Sample Input
10

Sample Output
16.48
 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.printf("%.2f", getSum(num));
        scanner.close();
    }

    public static double getSum(int num) {
        int array[] = new int[num + 2];
        array[0] = array[1] = 1;
        for (int i = 2; i <= num + 1; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }
        double sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += (double) array[i + 1] / array[i];
        }
        return sum;
    }
}
