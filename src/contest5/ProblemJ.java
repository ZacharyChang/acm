/*
Description
请设计输出实数的格式，包括：⑴一行输出一个实数；⑵一行内输出两个实数；⑶一行内输出三个实数。实数用"6.2f"格式输出。
Input
一个实数，float范围
Output
输出3行，第一行打印一遍输入的数，第二行打印两遍，第三行打印三遍。 第二行和第三行，用空格分隔同一行的数字。 实数用"6.2f"格式输出。
Sample Input
0.618

Sample Output
  0.62
  0.62   0.62
  0.62   0.62   0.62
 */
package contest5;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        System.out.printf("%6.2f\n", number);
        System.out.printf("%6.2f %6.2f\n", number, number);
        System.out.printf("%6.2f %6.2f %6.2f\n", number, number, number);
        scanner.close();
    }
}
