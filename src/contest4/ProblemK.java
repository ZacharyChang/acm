/*
Description
用迭代法求平方根。

求平方根的迭代公式为： X[n+1]=1/2(X[n]+a/X[n])

要求前后两次求出的得差的绝对值少于0.00001。

输出保留3位小数。

Input
一个数a(0< a < 109).

Output
a的算术平方根

Sample Input
4

Sample Output
2.000

 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.printf("%.3f", getSquareRoot(num));
        scanner.close();
    }

    public static double getSquareRoot(int num) {
        double result = 1;
        double temp;
        do {
            temp = result;                //保存上一次计算的值
            result = 0.5 * (result + num / result);      //牛顿迭代法
        } while (Math.abs(result - temp) > 0.00001);        //如果两次求值差的绝对值小于0.00001则结束循环
        return result;
    }
}
