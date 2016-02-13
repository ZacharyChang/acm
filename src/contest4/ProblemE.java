/*
Description
求以下三数的和,保留2位小数 1~a之和 1~b的平方和 1~c的倒数和
Input
a b c
Output
1+2+...+a + 1^2+2^2+...+b^2 + 1/1+1/2+...+1/c
Sample Input
100 50 10

Sample Output
47977.93
 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.printf("%.2f\n", getSum(a) + getSquareSum(b) + getReciprocalSum(c));
        scanner.close();
    }

    public static int getSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static int getSquareSum(int num) {
        int squareSum = 0;
        for (int i = 1; i <= num; i++) {
            squareSum += i * i;
        }
        return squareSum;
    }

    public static double getReciprocalSum(int num) {
        double reciprocalSum = 0;
        for (int i = 1; i <= num; i++) {
            reciprocalSum += 1.0 / i;
        }
        return reciprocalSum;
    }
}
