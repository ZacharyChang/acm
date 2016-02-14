/*
Description
一个数如果恰好等于它的因子之和，这个数就称为"完数"。 例如，6的因子为1、2、3，而6=1+2+3，因此6是"完数"。 编程序找出N之内的所有完数，并按下面格式输出其因子：

Input
N

Output
? its factors are ? ? ?

Sample Input
1000

Sample Output
6 its factors are 1 2 3
28 its factors are 1 2 4 7 14
496 its factors are 1 2 4 8 16 31 62 124 248
 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPerfectNumbers(n);
        scanner.close();
    }

    public static void printPerfectNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            String str = " its factors are ";
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                    str = str + j + " ";
                }
            }
            if (sum == i) {
                System.out.println(i + str);
            }
        }
    }
}
