/*
Description
Fibonacci数列定义为（1,1,2,3,5,8,.....），即每个元素是前两个元素的和。如果一个Fibonacci数与所有小于它的Fibonacci数互质，那么称之为Fibonacci质数。
现在要求你输出前n个Fibonacci数
The Fibonacci Numbers {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...} are defined by the recurrence:
F(0)=0
F(1)=1
F(i)=F(i-1)+F(i-2)
Write a program to calculate the Fibonacci Numbers.

Input
 The first line of the input file contains a single integer T, the number of test cases. The following T lines,each contains an integer n ( 0 <= n <= 45 ), and you are expected to calculate Fn

Output
 Output Fn on a separate line.

Sample Input
5
0
3
5
9
20

Sample Output
0
2
5
34
6765
 */
package contest2;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemK {
    private static int fibo[] = new int[46];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, n = scanner.nextInt();
        fibonacci();
        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            System.out.println(fibo[num]);
        }
    }

    public static void fibonacci() {
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= 45; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }
}
