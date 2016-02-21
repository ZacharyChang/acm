/*
Description
写一函数，将两个字符串中的元音字母复制到另一个字符串，然后输出。
Input
一行字符串
Output
顺序输出其中的元音字母（aeiuo）
Sample Input
abcde

Sample Output
ae
 */
package contest5;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        printVowels(str);
        scanner.close();
    }

    public static void printVowels(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
