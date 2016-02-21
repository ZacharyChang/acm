/*
Description
定义一个带参的宏，使两个参数的值互换，并写出程序，输入两个数作为使用宏时的实参。输出已交换后的两个值。
Input
两个数，空格隔开
Output
交换后的两个数，空格隔开
Sample Input
1 2

Sample Output
2 1
 */
package contest5;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(num2 + " " + num1);
        scanner.close();
    }
}
