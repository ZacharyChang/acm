/* HDU 2015
Description
有一个长度为n(n<=100)的数列，该数列定义为从2开始的递增有序偶数，现在要求你按照顺序每m个数求出一个平均值，如果最后不足m个，则以实际数量求平均值。编程输出该平均值序列。

Input
输入数据有多组，每组占一行，包含两个正整数n和m，n和m的含义如上所述。

Output
对于每组输入数据，输出一个平均值序列，每组输出占一行。

Sample Input
3 2
4 2

Sample Output
3 6
3 7
 */
package contest3;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
//            printAverage(n,m);
            int number, sum = 0, x = 2;
            if (n % m != 0) {
                number = n / m + 1;
            } else {
                number = n / m;
            }
            int[] s = new int[number];
            if (n % m == 0) {
                for (int i = 0; i < number; i++) {
                    for (int j = 0; j < m; j++) {
                        sum += x;
                        x = x + 2;
                    }
                    s[i] = sum / m;
                    sum = 0;
                }
            } else {
                for (int i = 0; i < number; i++) {
                    if (i == number - 1) {
                        for (int j = 0; j < (n % m); j++) {
                            sum += x;
                            x = x + 2;
                        }
                        s[i] = sum / (n % m);
                    } else {
                        for (int j = 0; j < m; j++) {
                            sum += x;
                            x = x + 2;
                        }
                        s[i] = sum / m;
                    }
                    sum = 0;
                }
            }
            for (int i = 0; i < number; i++) {
                if (i == number - 1) System.out.println(s[i]);
                else System.out.print(s[i] + " ");
            }
        }
    }

//    public static void printAverage(int n, int m) {
//        int b = 2;
//        for (int i = 0; i < n / m; i++) {
//            if (i == 0) {
//                System.out.print(b + m - 1);
//            } else {
//                System.out.print(" " + (b + m - 1));
//            }
//            b += m * 2;
//        }
//        if (n % m == 0) {
//            System.out.println();
//        } else {
//            System.out.println(" " + (b + n % m - 1));
//        }
//    }
}
