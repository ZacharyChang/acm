/*
Description
写一函数，将两个字符串连接
Input
两行字符串
Output
链接后的字符串
Sample Input
123
abc

Sample Output
123abc
 */
package contest5;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.println(str1 + str2);
        scanner.close();
    }
}
