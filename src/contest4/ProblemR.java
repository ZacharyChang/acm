/*
Description
求一元二次方程 ax2+bx+c=0 的根，用三个函数分别求当b^2-4ac大于0、等于0、和小于0时的根，并输出结果。从主函数输入a、b、c的值。

Input
一元二次方程的系数a, b, c (|a|, |b|, |c| < 105)

Output
x1=? x2=?

Sample Input
4 1 1

Sample Output
x1=-0.125+0.484i x2=-0.125-0.484i
 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        printAnswer(a, b, c);
        scanner.close();
    }

    public static void printAnswer(int arga, int argb, int argc) {
        int key = argb * argb - 4 * arga * argc;
        double x1, x2, x;
        if (key > 0) {
            double sqrt = Math.sqrt(key);
            x1 = (-argb + sqrt) / (2.0 * arga);
            x2 = (-argb - sqrt) / (2.0 * arga);
            System.out.printf("x1=%.3f x2=%.3f", x1, x2);
        } else if (key == 0) {
            x1 = x2 = (-argb) / (2.0 * arga);
            System.out.printf("x1=%.3f x2=%.3f", x1, x2);
        } else {
            double inverseSqrt = Math.sqrt(-key);
            double temp = inverseSqrt / (2.0 * arga);
            x = (-argb) / (2.0 * arga);
            System.out.printf("x1=%.3f+%.3fi x2=%.3f-%.3fi", x, temp, x, temp);
        }
    }
}
