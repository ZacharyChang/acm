/* HDU 2044
Description
有一只经过训练的蜜蜂只能爬向右侧相邻的蜂房，不能反向爬行。请编程计算蜜蜂从蜂房a爬到蜂房b的可能路线数。
其中，蜂房的结构如下所示。


Input
输入数据的第一行是一个整数N,表示测试实例的个数，然后是N 行数据，每行包含两个整数a和b(0<a<b<50)。

Output
对于每个测试实例，请输出蜜蜂从蜂房a爬到蜂房b的可能路线数，每个实例的输出占一行。

Sample Input
2
1 2
3 6

Sample Output
1
3
 */
package contest3;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemQ {

    private static long way[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(countWay(a, b));
        }
    }

    public static long countWay(int from, int to) {
        way = new long[50];
        way[from] = 1L;     // 注意必须加上L，否则为int类型，无法AC
        way[from + 1] = 2L;
        for (int j = from + 2; j < 50; j++) {
            way[j] = way[j - 1] + way[j - 2];
        }
        return way[to - 1];
    }
}
