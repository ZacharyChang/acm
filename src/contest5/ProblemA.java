/*
Description
写一函数，使输入的一个字符串按反序存放，在主函数中输入输出反序后的字符串。

Input
一行字符串(不含空格)

Output
逆序后的字符串

Sample Input
123456abcdef

Sample Output
fedcba654321
 */
package contest5;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        printReversedOrder(str);
        scanner.close();
    }

    public static void printReversedOrder(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(str.length() - i - 1));
        }
    }
}
