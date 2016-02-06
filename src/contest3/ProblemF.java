/*
Description
输入一行字符(少于300个字符)，以回车结束，统计其中单词的个数。各单词之间用空格分隔，空格数可以是多个。

Input
输入一字符串，以回车结束。

Output
输出该字符串中单词的个数

Sample Input
This is  a     c    program.

Sample Output
5
 */
package contest3;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str, words[];
        while (scanner.hasNext()) {
            str = scanner.nextLine();
            words = str.split("\\s+");
            System.out.println(words.length);
        }
    }
}
