package contest1; /**
 * Description
 * 输出一个十进制整数的32位二进制补码表示中有多少个'1'。
 * <p>
 * Input
 * 第一行一个整数T（T<1000），表示测试数据组数。
 * 每组测试样例包括一个十进制整数n（-2147483647<=n<=2147483647)。
 * <p>
 * Output
 * 对于每组样例，先在第一行输出样例编号。然后输出n的32位二进制补码表示中'1'的个数。
 * <p>
 * Sample Input
 * 5
 * 1
 * 2
 * 3
 * 4
 * -1
 * <p>
 * Sample Output
 * Case 1:
 * 1
 * Case 2:
 * 1
 * Case 3:
 * 2
 * Case 4:
 * 1
 * Case 5:
 * 32
 */

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemP {

    public static int countOne(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        if (scanner.hasNext()) {
            num = scanner.nextInt();
        }
        for (int i = 1; i <= num; i++) {
            if (scanner.hasNext()) {
                int n = scanner.nextInt();
                System.out.println("Case " + i + ":");
                System.out.println(countOne(n));
            }
        }
    }
}
