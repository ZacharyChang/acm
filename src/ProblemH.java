/**
 Description
 A magic island Geraldion, where Gerald lives, has its own currency system. It uses banknotes of several values. But the problem is, the system is not perfect and sometimes it happens that Geraldionians cannot express a certain sum of money with any set of banknotes. Of course, they can use any number of banknotes of each value. Such sum is called unfortunate. Gerald wondered: what is the minimum unfortunate sum?

 Input
 Multiple test input.

 The first line contains number n (1≤n≤1000) — the number of values of the banknotes that used in Geraldion.

 The second line contains n distinct space-separated numbers a1,a2,...,an (1≤ai≤106) — the values of the banknotes.

 Output
 Print a single line — the minimum unfortunate sum. If there are no unfortunate sums, print -1.

 Sample Input
 5
 1 2 3 4 5

 Sample Output
 -1
 */

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemH {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            if (str.equals("\n")) {
                break;
            } else {
                n = Integer.parseInt(str);
                int flag = 0;
                for (int i = 0; i < n; i++) {
                    m = scanner.nextInt();
                    if (m == 1) {
                        flag = 1;
                    }
                }
                if (flag == 1) {
                    System.out.println(-1);
                } else {
                    System.out.println(1);
                }
            }
        }
    }
}
