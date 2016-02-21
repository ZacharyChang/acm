/*
Description
输入两个整数，求他们相除的余数。

Input
a b两个数

Output
a/b的余数

Sample Input
3 2

Sample Output
1
 */
package contest5;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(num1 % num2);
        scanner.close();
    }
}
