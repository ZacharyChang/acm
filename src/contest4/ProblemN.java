/*
Description
求一个3×3矩阵对角线元素之和。
Input
矩阵
Output
主对角线 副对角线 元素和
Sample Input
1 2 3
1 1 1
3 2 1

Sample Output
3 7
 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println((array[0][0] + array[1][1] + array[2][2]) + " " + (array[0][2] + array[1][1] + array[2][0]));
    }
}
