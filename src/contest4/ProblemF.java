/*
Description
打印出所有"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该本身。 例如：153是一个水仙花数，因为153=1^3+5^3+3^3。 Output:
153
???
???
???
Input
无
Output
所有的水仙花数，从小的开始。 每行一个
 */
package contest4;

/**
 * Created by ZacharyChang.
 */
public class ProblemF {
    public static void main(String[] args) {
        printNarcissisticNumbers();
    }

    public static void printNarcissisticNumbers() {
        int baiwei, shiwei, gewei;
        for (int num = 100; num < 1000; num++) {
            baiwei = num / 100;
            shiwei = num % 100 / 10;
            gewei = num % 10;
            if (num == (Math.pow(baiwei, 3) + Math.pow(shiwei, 3) + Math.pow(gewei, 3))) {
                System.out.println(num);
            }
        }
    }
}
