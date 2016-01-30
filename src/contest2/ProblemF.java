/*
Description
输入三个整数，分别代表三角形的三条边长度，判断能否构成直角三角形

Input
输入3个整数a,b,c（多组数据,-5000000<a,b,c<5000000）

Output
如果能组成直角三角形，输出yes否则输出no

Sample Input
3 4 5

Sample Output
yes
 */
package contest2;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemF {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            if (isTriangle(a, b, c)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        while (a % 10 == 0 && b % 10 == 0 && c % 10 == 0) {
            a = a / 10;
            b = b / 10;
            c = c / 10;
        }
        return a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a;
    }
}
