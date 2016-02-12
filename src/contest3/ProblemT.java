/*
Description
“排排站，赏美女……”
YJ师兄在今年牡丹江赛区人品爆发，怒摘银奖，心情倍好，现组织大家去黄家湖边站成一排看美女 ^.^
N个人站成一排。不巧，美女们只在队伍的最左边和最右边，你们可以向左看或者向右看。如果第i个人向左看，当且仅当第i个人的身高h[i]>=h[j] （ j=1...i-1） 时，他能看到美女；如果第i个人向右看，当且仅当第i个人的身高h[i]>=h[j] （j=i+1..N）时，他能看见美女。已知N个人的身高，求最多有多少人能看到美女。
Input
先输入一个正整数T，表示有T组数据
每组数据：第一行 N。N<=100 000
　　　　　第二行N个整数，表示每个人的身高（1<=h<=20000）
Output
输出能看到美女的人数。
Sample Input
1
5
1 4 7 6 2

Sample Output
5

 */
package contest3;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemT {
    public static void main(String[] args) {
        int n, i;
        int a[] = new int[100005];
        int b[] = new int[100005];
        int m_ax, sum;
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            n = scanner.nextInt();
            for (i = 1; i <= n; i++) {
                a[i] = scanner.nextInt();
            }
            m_ax = a[1];
            sum = 0;
            for (i = 1; i <= n; i++) {
                if (a[i] >= m_ax) {
                    m_ax = a[i];
                    sum++;
                    b[i] = 1;//记录下标，同时标记。
                }
            }
            m_ax = a[n];
            for (i = n; i > 0; i--) {
                if (a[i] >= m_ax) {
                    m_ax = a[i];
                    if (b[i] == 0)
                        sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
