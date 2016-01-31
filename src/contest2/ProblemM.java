/*
Description
小明有一天玩完围棋突然想到，围棋是包围形的游戏，我可以做出一个一层层互相包围的正方形棋盘吗？小明很感兴趣却不知道怎么做，现在由你来解决这个问题。

Input
输入一个数字n(n<30)来规定围棋的正方形边长。（多组测试）

Output
输出正方形棋盘。
每次测试结束空一行。

当奇数时最外层为‘*’否则为‘@’。

Sample Input
5

Sample Output
*****
*@@@*
*@*@*
*@@@*
*****
 */
package contest2;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemM {
    private static int array[][];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int lines = scanner.nextInt();
            createArray(lines);
            printArray();
        }
        scanner.close();
    }

    public static void createArray(int n) {
        array = new int[n][n];
        float medium = ((float) n - 1) / 2;        //1.5
        if (n % 2 == 0) {
            if (n % 4 == 0) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if ((int) (Math.max(Math.abs(i - medium), Math.abs(j - medium)) + 0.5) % 2 == 0) {
                            array[i][j] = 0;
                        } else {
                            array[i][j] = 1;
                        }
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if ((int) (Math.max(Math.abs(i - medium), Math.abs(j - medium)) + 0.5) % 2 == 0) {
                            array[i][j] = 1;
                        } else {
                            array[i][j] = 0;
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((int) (Math.max(Math.abs(i - medium), Math.abs(j - medium))) % 2 == 0) {
                        array[i][j] = 1;
                    } else {
                        array[i][j] = 0;
                    }
                }
            }
        }
    }

    public static void printArray() {
        for (int[] nums : array) {
            for (int num : nums) {
                if (num == 0) {
                    System.out.print("@");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
