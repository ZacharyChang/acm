/*
Description
分别用函数和带参的宏，从三个数中找出最大的数。
Input
3个实数
Output
最大的数,输出两遍，先用函数，再用宏。 保留3位小数。
Sample Input
1 2 3

Sample Output
3.000
3.000
 */
package contest5;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemK {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.printf("%.3f\n", (float) max(a, b, c));
        System.out.printf("%.3f", (float) max(a, b, c));
    }

    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
