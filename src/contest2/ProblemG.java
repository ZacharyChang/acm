/*
Description
输出所有形如aabb的四位完全平方数（即该四位数前2位数字相等，后2位数字相等，且该四位数是另外一个数的平方）。

Input
无

Output
按照从小到大输出4位完全平方数（每个数一行）
 */
package contest2;

/**
 * Created by ZacharyChang.
 */
public class ProblemG {
    public static void main(String[] args) {
        int num;
        for (int i = 32; i < 100; i++) {
            num = i * i;
            if (isNum(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isNum(int n) {
        int a = n / 1000;
        int b = n / 100 % 10;
        int c = n / 10 % 10;
        int d = n % 10;
        if (a == b && c == d) {
            System.out.println(a + " " + b + " " + c + " " + d);
            return true;
        }
        return false;
    }
}
