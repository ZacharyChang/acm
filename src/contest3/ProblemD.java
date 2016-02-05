/*
Description
找出数组中最大的元素的下标。

Input
多组测试，每组先输入一个不大于10的整数n
然后是n个整数

Output
输出这n个整数中最大的元素及下标值

Sample Input
4
1 4 5 6

Sample Output
6 3
 */
package contest3;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, array[], maxPosition = 0, maxValue;
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            array = new int[n];
            array[0] = scanner.nextInt();
            maxValue = array[0];
            for (int i = 1; i < n; i++) {
                array[i] = scanner.nextInt();
                if (array[i] > maxValue) {
                    maxPosition = i;
                    maxValue = array[i];
                }
            }
            System.out.println(maxValue + " " + maxPosition);
        }
    }
}
