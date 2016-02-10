/*
escription
YB打算写一个功能强大的文本编辑器，并取一个炫酷拉风，高端优雅的名字，比如“YB牌文本编辑器”之类的。既然功能强大，那肯定得有个查找功能吧。但是他在完成这个功能的时候遇到一点小问题。现在来请求你的帮助。
给你一个文本串s和一个模式串t，你需要写一个程序来查找t在s中出现了多少次。
Input
第一行是一个正整数T，表示总共有T组测试数据。
接下来有T组测试，每组测试数据包括两行。第一行是文本串s，长度不大于10000。第二行是模式串t，长度不大于10。都是只有小写字母组成的字符串。
Output
每组测试对应输出一个正整数答案，表示k在s中出现了多少次。
Sample Input
2
abababa
aba
abcabc
abc

Sample Output
3
2

 */
package contest3;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str1, str2;
        for (int i = 0; i < n; i++) {
            str1 = scanner.next();
            str2 = scanner.next();
            System.out.println(countMatch(str1, str2));
        }
    }

    public static int countMatch(String str, String match) {
        int count = 0;
        if (str.length() < match.length()) {
            return 0;
        }
        for (int i = 0; i <= str.length() - match.length(); i++) {
            if (str.substring(i, i + match.length()).equals(match)) {
                count++;
            }
        }
        return count;
    }
}
