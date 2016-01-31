/*
Description
现要求你把一个矩阵行列转置后输出，注意行数和列数可能不相同的。

Input
多组测试数据，每组测试数据先在一行输入n 和m ,表示这个矩阵的行数和列数（1 < n,m <= 10)
然后是n行m列的一个矩阵

Output
对于每组测试数据输出转置后的矩阵

Sample Input
3 2
1 2
3 4
5 6

Sample Output
1 3 5
2 4 6
 */
package contest2;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int row = scanner.nextInt();
            int column = scanner.nextInt();
            int array[][] = new int[row][column];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }
            oppPrint(array, row, column);
        }
        scanner.close();
    }

    public static void oppPrint(int array[][], int row, int column) {
        int oppArray[][] = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                oppArray[j][i] = array[i][j];
            }
        }
        for (int i = 0; i < column; i++) {
            System.out.print(oppArray[i][0]);
            for (int j = 1; j < row; j++) {
                System.out.print(" " + oppArray[i][j]);
            }
            System.out.println();
        }
    }
}
