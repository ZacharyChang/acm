/*
Description
三角形面积=SQRT(S*(S-a)*(S-b)*(S-c)) 其中S=(a+b+c)/2，a、b、c为三角形的三边。 定义两个带参的宏，一个用来求area， 另一个宏用来求S。 写程序，在程序中用带实参的宏名来求面积area。
Input
a b c三角形的三条边,可以是小数。
Output
三角形面积，保留3位小数
Sample Input
3 4 5

Sample Output
6.000
 */
package contest5;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.printf("%.3f", getArea(a, b, c));
        scanner.close();
    }

    public static double getArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
