package contest1; /**
 * Description
 * 新的一年到了，寒假闲着也是闲着，于是爱数学的小豪思考一个问题。2016年，小豪喜欢数字6，于是一个数的某一位有数字6他都喜欢（比如2016个位是6，所以小豪喜欢2016这个数），但是小豪讨厌9（因为9的颜值太低），任意一个数，只要某个数字是9他都不喜欢（就算这个数有6，比如6699这个数就是小豪不喜欢的）。那么问题来了，现在给一个a,b，求a到b之间有多少个数是小豪喜欢的。
 * <p>
 * Input
 * 先输入一个T表示测试数据组数(T<=50)
 * 每组数据输入a,b(0<a<=b<1000000)
 * <p>
 * Output
 * 输出小豪喜欢数的个数
 * <p>
 * Sample Input
 * 3
 * 6 9
 * 12 20
 * 64 70
 * <p>
 * Sample Output
 * 1
 * 1
 * 5
 */

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemL {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            n = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(count(a, b));
        }
    }

    /*    public static int count(String start, String end) {
            int count = 0;
            loop:
            for (int i = Integer.parseInt(start); i <= Integer.parseInt(end); i++) {
                for (int j = 1; j <= end.length(); j++) {
                    if (getNum(i, j) == 9) {
                        continue loop;
                    }
                }
                for (int k = 1; k <= end.length(); k++) {
                    if (getNum(i, k) == 6) {
                        count++;
                        continue loop;
                    }
                }
            }
            return count;
        }
    */
    public static int count(int num, int n) {
        int i = 0;
        for (; num <= n; num++) {
            String str = num + "";
            if (str.contains("6") && !str.contains("9"))
                i++;
        }
        return i;
    }
}
