/*
Description
求一整数的绝对值。

Input
输入数据有多组，每组占一行，每行包含一个整数。

Output
对于每组输入数据，输出它的绝对值，要求每组数据输出一行。

Sample Input
123

Sample Output
123

HINT
 注意数值会比较大，建议用字符串处理
 */
package contest3;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        while (scanner.hasNext()) {
            str = scanner.nextLine();
            if (str.startsWith("-")) {
                System.out.println(str.replaceFirst("-", ""));
            } else {
                System.out.println(str);
            }
        }
    }
}
