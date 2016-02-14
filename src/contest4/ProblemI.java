/*
Description
一球从M米高度自由下落，每次落地后返回原高度的一半，再落下。 它在第N次落地时反弹多高？共经过多少米？ 保留两位小数
Input
M N
Output
它在第N次落地时反弹多高？共经过多少米？ 保留两位小数，空格隔开，放在一行
Sample Input
1000 5

Sample Output
31.25 2875.00
 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int time = scanner.nextInt();
        printHeightAndLength(height, time);
        scanner.close();
    }

    public static void printHeightAndLength(int height, int time) {
        double totalLength = 0;
        double currentHeight = height;
        for (int i = 0; i < time; i++) {
            if (i != time - 1) {
                totalLength += currentHeight + currentHeight / 2.0;
            } else {
                totalLength += currentHeight;
            }
            currentHeight /= 2.0;
        }
        System.out.printf("%.2f %.2f", currentHeight, totalLength);
    }
}
