/*
Description
猴子吃桃问题。猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个。 第二天早上又将剩下的桃子吃掉一半，又多吃一个。以后每天早上都吃了前一天剩下的一半零一个。 到第N天早上想再吃时，见只剩下一个桃子了。求第一天共摘多少桃子。
Input
N
Output
桃子总数
Sample Input
10

Sample Output
1534
 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(numberBefore(n));
        scanner.close();
    }

    public static int numberBefore(int num) {
        int number = 1;
        for (int i = 0; i < num - 1; i++) {
            number = (number + 1) * 2;
        }
        return number;
    }
}
