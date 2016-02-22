/*
Description
CJ最近在写CSS，由于内容太多，导致网页加载速度很慢，于是他决定去掉CSS文件中的所有空白字符。但是他最近撸多了，手有点残，需要你帮忙写个程序帮助他完成这项工作。

Input
输入为一个CSS文件内容。

Output
请输出把该文件内容中的所有空白符去掉过后的结果。

Sample Input
.octicon-mark-github {
    position: absolute;
    top: 38px;
    left: 50%;
    margin-left: -12px;
    font-size: 64px;
    color: #000;
}

Sample Output
.octicon-mark-github{position:absolute;top:38px;left:50%;margin-left:-12px;font-size:64px;color:#000;}
 */
package contest5;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            System.out.print(str.replaceAll(" ", "").replaceAll("\t", ""));
        }
        scanner.close();
    }
}
