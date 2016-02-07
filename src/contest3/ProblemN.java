/*
Description
输入三个字符后，按各字符的ASCII码从小到大的顺序输出这三个字符。

Input
输入数据有多组，每组占一行，有三个字符组成，之间无空格。

Output
对于每组输入数据，输出一行，字符中间用一个空格分开。

Sample Input
qwe
asd
zxc

Sample Output
e q w
a d s
c x z
 */
package contest3;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        char[] chars;
        while (scanner.hasNext()) {
            chars = new char[3];
            str = scanner.nextLine();
            for (int i = 0; i < 3; i++) {
                chars[i] = str.charAt(i);
            }
            printIncreaseByAscii(chars);
        }
    }

    public static void printIncreaseByAscii(char[] chars) {
        char temp;
        if (chars.length == 3) {
            if (chars[0] > chars[1]) {
                temp = chars[0];
                chars[0] = chars[1];
                chars[1] = temp;
            }
            if (chars[0] > chars[2]) {
                temp = chars[0];
                chars[0] = chars[2];
                chars[2] = temp;
            }
            if (chars[1] > chars[2]) {
                temp = chars[1];
                chars[1] = chars[2];
                chars[2] = temp;
            }
            System.out.println(chars[0] + " " + chars[1] + " " + chars[2]);
        }
    }
}
