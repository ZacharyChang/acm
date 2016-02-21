/*
Description
输入一行电报文字，将小写字母变成其下一字母（如’a’变成’b’……’z’变成’ａ’其它字符不变）。

Input
一行字符

Output
加密处理后的字符

Sample Input
a b

Sample Output
b c
 */
package contest5;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        printCharacters(str);
        scanner.close();
    }

    public static void printCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(getResult(str.charAt(i)));
        }
    }

    public static char getResult(char ch) {
        if (isLowerCharacters(ch)) {
            return (char) (ch + 1);
        } else {
            return ch;
        }
    }

    public static boolean isLowerCharacters(char ch) {
        return ch >= 'a' && ch <= 'z';
    }
}
