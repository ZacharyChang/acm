/**
 Description
 小明经常被老师要求去算十进制求和的问题，现在他突然想为什么我们不计算一下从0到N位的二进制数中含1位的和是多少呢？如果一个正整数m表示成二进制，它的位数为n（不包含前导0），寒月称它为一个n二进制数。所有的n二进制数中，1的总个数被称为n对应的月之数。
 例如，2位及之前，有0(0),1(1),2(10),3(11)和为4。

 Input
 输入一个数字n(n<5000)。（多组测试）

 Output
 输出答案。

 Sample Input
 2

 Sample Output
 4

 */

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemT {

    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            if (str.equals("\n")) {
                break;
            } else {
                a = Integer.parseInt(str);
                System.out.println((int)result(a));
            }
        }
        scanner.close();
    }

    public static double moonNum(int n) {
        return (Math.pow(2.0, n - 2) * (n + 1));
    }

    public static double result(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += moonNum(i);
        }
        return sum;
    }
}
