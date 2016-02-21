/*
Description
写一函数，输入一个四位数字，要求输出这四个数字字符，但每两个数字间空格。如输入1990，应输出"1 9 9 0"。
Input
一个四位数
Output
增加空格输出
Sample Input
1990

Sample Output
1 9 9 0
 */
package contest5;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        printNumbers(num);
        scanner.close();
    }

    public static void printNumbers(String num) {
        StringBuffer buffer = new StringBuffer(String.valueOf(num.charAt(0)));
        for (int i = 1; i < num.length(); i++) {
            buffer.append(" ");
            buffer.append(num.charAt(i));
        }
        System.out.print(buffer);
    }
}
