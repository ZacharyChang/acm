/*
Description
用选择法对10个整数从小到大排序。
Input
10个整数
Output
排序好的10个整数
Sample Input
4 85  3 234 45 345 345 122 30 12

Sample Output
3
4
12
30
45
85
122
234
345
345
 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = scanner.nextInt();
        }
        sortArray(num);
        for (int n : num) {
            System.out.println(n);
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
