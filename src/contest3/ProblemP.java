/*  HDU 2084
Description
在讲述DP算法的时候，一个经典的例子就是数塔问题，它是这样描述的：

有如下所示的数塔，要求从顶层走到底层，若每一步只能走到相邻的结点，则经过的结点的数字之和最大是多少？

已经告诉你了，这是个DP的题目，你能AC吗?

Input
输入数据首先包括一个整数C,表示测试实例的个数，每个测试实例的第一行是一个整数N(1 <= N <= 100)，表示数塔的高度，接下来用N行数字表示数塔，其中第i行有个i个整数，且所有的整数均在区间[0,99]内。

Output
对于每个测试实例，输出可能得到的最大和，每个实例的输出占一行。

Sample Input
1
5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5

Sample Output
30
 */
package contest3;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemP {
    private static int[][] s, m;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, t = scanner.nextInt();
        while (t-- > 0) {
            n = scanner.nextInt();
            s = new int[n + 2][n + 2];
            m = new int[n + 2][n + 2];
            for (int r = n - 1; r >= 0; r--) {
                for (int i = 1; i <= n - r; i++) {
                    int j = i + r;
                    m[i][j] = scanner.nextInt();
                }
            }
            for (int r = 0; r < n; r++) {
                for (int i = 1; i <= n - r; i++) {
                    int j = i + r;
                    s[i][j] = s[i][j - 1] > s[i + 1][j] ? s[i][j - 1] : s[i + 1][j];
                    s[i][j] += m[i][j];
                }
            }
            System.out.println(s[1][n]);
        }
    }
}
