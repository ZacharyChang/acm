/*
Description
给出n个城市的位置坐标，求出每个城市距离其他城市的最短距离和最长距离。

Input
多组测试数据，其中，对于每组测试数据：
第一行输入n（2≤n≤100000)，
第二行输入n个整数x1,x2,...,xn (-1000000000≤xi≤1000000000)。xi代表该城市的坐标，并且按照升序排列。
Output
输出n行。第i行输出第i个城市距离其他的城市的最短距离和最长距离。

Sample Input
4
-5 -2 2 7
2
-1 1

Sample Output
3 12
3 9
4 7
5 12
2 2
2 2

 */
package contest2;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemT {
    private static int city[];
    private static int distance[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            city = new int[n];
            for (int i = 0; i < n; i++) {
                city[i] = scanner.nextInt();
            }
            solve();
        }
        scanner.close();
    }

    public static void solve() {
        distance = new int[city.length - 1];
        for (int i = 1; i < city.length; i++) {
            distance[i - 1] = city[i] - city[i - 1];
        }
        for (int i = 0; i < city.length; i++) {
            System.out.println(getMin(i) + " " + getMax(i));
        }
    }

    public static int getMin(int n) {
        if (n == 0) {
            return distance[0];
        } else if (n == (city.length - 1)) {
            return distance[city.length - 2];
        } else {
            return distance[n - 1] < distance[n] ? distance[n - 1] : distance[n];
        }
    }

    public static int getMax(int n) {
        int left = city[n] - city[0];
        int right = city[city.length - 1] - city[n];
        return left > right ? left : right;
    }
}
