/*
Description
fcbruce在玩Linear Algebra，现在他需要求一个矩阵的trace，但他觉得这个工作太小儿科，决定交给你来做。

Input
输入的第一行是一个整数T(T<100)，表示有T组测试数据。每组测试数据的第一行是一个整数n(0<n<7),表示这个矩阵是n*n的方阵，然后给出一个n行n列的方阵，方阵中所有元素均为小于7的自然数。

Output
对于每个矩阵，输出该矩阵的trace

Sample Input
1
1
1

Sample Output
1

HINT
You can find the mean of trace by google or other search engine.
 */
package contest5;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i = 0; i < times; i++) {
            int length = scanner.nextInt();
            int[][] array = new int[length][length];
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < length; k++) {
                    array[j][k] = scanner.nextInt();
                }
            }
            printTrace(array);
        }


    }

    public static void printTrace(int array[][]) {
        int i, j;
        int sum = 0;
        int row = array.length;
        int column = array[0].length;
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (i == j) {
                    sum = sum + (array[i][j]);
                }
            }
        }
        System.out.println(sum);
    }
}
