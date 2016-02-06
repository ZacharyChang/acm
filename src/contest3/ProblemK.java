/*
Description
有一楼梯共M级，刚开始时你在第一级，若每次只能跨上一级或二级，要走上第M级，共有多少种走法？

Input
输入数据首先包含一个整数N，表示测试实例的个数，然后是N行数据，每行包含一个整数M（1<=M<=40）,表示楼梯的级数。

Output
对于每个测试实例，请输出不同走法的数量。

Sample Input
2
2
3

Sample Output
1
2
 */
package contest3;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            System.out.println(count(num - 1));
        }
    }

    public static int count(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return count(num - 1) + count(num - 2);
    }
}
