/*
Description
编写一函数，由实参传来一个字符串，统计此字符串中字母、数字、空格和其它字符的个数，在主函数中输入字符串以及输出上述结果。 只要结果，别输出什么提示信息。
Input
一行字符串
Output
统计数据，4个数字，空格分开。
Sample Input
!@#$%^QWERT    1234567

Sample Output
5 7 4 6
 */
package contest5;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemE {
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
        System.out.println(num[0] + " " + num[1] + " " + num[2] + " " + num[3] + " ");
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
