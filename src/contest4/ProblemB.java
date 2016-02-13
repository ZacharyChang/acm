/*
Description
输入一行字符，分别统计出其中英文字母、数字、空格和其他字符的个数。

Input
一行字符

Output
统计值

Sample Input
aklsjflj123 sadf918u324 asdf91u32oasdf/.';123

Sample Output
23 16 2 4

 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemB {
    private static int num[] = {0, 0, 0, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        countCharacters(str);
        scanner.close();
    }

    public static void countCharacters(String str) {
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            addChar(ch);
        }
        System.out.println(num[0] + " " + num[1] + " " + num[2] + " " + num[3]);
    }

    public static void addChar(char ch) {
        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {      // 字母
            num[0]++;
        } else if (ch >= '0' && ch <= '9') { // 数字
            num[1]++;
        } else if (ch == ' ') {      // 空格
            num[2]++;
        } else {
            num[3]++;           // 其他字符
        }
    }
}
