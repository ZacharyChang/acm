/*
Description
这次xhd面临的问题是这样的：在一个平面内有两个点，求两个点分别和原点的连线的夹角的大小。

注：夹角的范围[0，180]，两个点不会在圆心出现。

Input
输入数据的第一行是一个数据T，表示有T组数据。
每组数据有四个实数x1,y1,x2,y2分别表示两个点的坐标,这些实数的范围是[-10000,10000]。

Output
对于每组输入数据，输出夹角的大小精确到小数点后两位。

Sample Input
2
1 1 2 2
1 1 1 0

Sample Output
0.00
45.00
 */
package contest3;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            getAngle(x1, y1, x2, y2);
        }
    }

    public static void getAngle(int x1, int y1, int x2, int y2) {
        int a = x1 * x1 + y1 * y1;
        int b = x2 * x2 + y2 * y2;
        int c = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        double temp = (a + b - c) / (2.0 * Math.sqrt(a) * Math.sqrt(b));
        double result = Math.acos(temp) * 180 / Math.PI;
        System.out.printf("%.2f\n", result);
    }

}
