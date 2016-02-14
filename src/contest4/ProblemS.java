/*
Description
写一个判断素数的函数，在主函数输入一个整数，输出是否是素数的消息。
Input
一个数
Output
如果是素数输出prime 如果不是输出not prime
Sample Input
97

Sample Output
prime
 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (isPrime(num)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        scanner.close();
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < (num / 2 + 1); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
