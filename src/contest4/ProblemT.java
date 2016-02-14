/*
Description
写一个函数，使给定的一个二维数组（３×３）转置，即行列互换。

Input
一个3x3的矩阵

Output
转置后的矩阵（每行最后一个数后面也有空格）

Sample Input
1 2 3
4 5 6
7 8 9

Sample Output
1 4 7
2 5 8
3 6 9
 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num[i][j] = scanner.nextInt();
            }
        }
        printArray(transpose(num));
        scanner.close();
    }

    public static int[][] transpose(int array[][]) {
        int newArray[][] = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newArray[i][j] = array[j][i];
            }
        }
        return newArray;
    }

    public static void printArray(int array[][]) {
        for (int[] anArray : array) {
            for (int anAnArray : anArray) {
                System.out.print(anAnArray + " ");
            }
            System.out.println();
        }
    }
}
