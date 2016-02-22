/*
Description
fcbruce最近在研究机器学习，其中一项很重要的工作就是进行矩阵乘法，但是他现在忙着做微积分，需要你的帮助。

Input
输入的第一行是一个整数T(T<100)，表示有T组测试数据。每组测试数据的第一行是一个整数n(0<n<7),表示这个矩阵是n*n的方阵，然后给出一个n行n列的方阵，方阵中所有元素均为小于7的自然数。

Output
对于每个给定的矩阵M，fcbruce需要你求出M^T*M,M^T为矩阵M的转置。

Sample Input
1
2
1 2
3 4

Sample Output
10 14
14 20

HINT
 如果B是矩阵A的转置，则对于矩阵B的元素B[i][j] = A[j][i].
 */
package contest5;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i = 0; i < times; i++) {
            int n = scanner.nextInt();
            int array[][] = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    array[j][k] = scanner.nextInt();
                }
            }
            printResult(getTransposedArray(array), array);
        }
        scanner.close();
    }

    public static int[][] getTransposedArray(int array[][]) {
        int result[][] = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[j][i] = array[i][j];
            }
        }
        return result;
    }

    public static void printResult(int[][] array1, int[][] array2) {
        int result[][] = new int[array1.length][array2[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int k = 0; k < array1[0].length; k++) {
                    result[i][j] = result[i][j] + array1[i][k] * array2[k][j];
                }
            }
        }
        for (int[] line : result) {
            System.out.print(line[0]);
            for (int i = 1; i < line.length; i++) {
                System.out.print(" " + line[i]);
            }
            System.out.println();
        }
    }
}
