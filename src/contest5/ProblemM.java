/*
Description
输入三个整数，按由小到大的顺序输出。
Input
三个整数
Output
由小到大输出成一行，每个数字后面跟一个空格
Sample Input
2 3 1

Sample Output
1 2 3
 */
package contest5;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = scanner.nextInt();
        }
        sortArray(num);
        for (int n : num) {
            System.out.print(n + " ");
        }
    }

    public static void sortArray(int array[]) {
        int i, j, k, temp;
        int n = array.length;
        for (i = 0; i < n - 1; i++) {
            k = i;
            for (j = i + 1; j < n; j++) {
                if (array[j] < array[k]) {
                    k = j;
                }
            }
            temp = array[k];
            array[k] = array[i];
            array[i] = temp;
        }
    }
}
