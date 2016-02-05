/*
Description
鸡和兔关在同一笼子中，已知总数量n和腿的总数量m,求鸡的数量和兔的数量。

Input
输入2个整数分别是n和m（多组测试数据）

Output
输出鸡的数量和兔的数量，中间用空格隔开，如果无解则输出No（每组测试数据一行）

Sample Input
14 32

Sample Output
12 2

x+y=n
2x+4y=m=>x+2y=m/2

x=2n-m/2
y=m/2-n
 */
package contest3;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            if (m % 2 == 0 && m >= 2 * n && m <= 4 * n) {
                System.out.println((2 * n - m / 2) + " " + (m / 2 - n));
            } else {
                System.out.println("No");
            }
        }
    }
}
