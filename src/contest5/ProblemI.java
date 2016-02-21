/*
Description
给年份year，定义一个宏，以判别该年份是否闰年。提示：宏名可以定义为LEAP_YEAR，形参为y，既定义宏的形式为 #define LEAP_YEAR(y) （读者设计的字符串）
Input
一个年份
Output
根据是否闰年输出，是输出"L",否输出"N"
Sample Input
2000

Sample Output
L
 */
package contest5;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        if (scanner.hasNext()) {
            year = scanner.nextInt();
        }
        GregorianCalendar calendar = new GregorianCalendar();
        if (calendar.isLeapYear(year)) {
            System.out.println("L");
        } else {
            System.out.println("N");
        }
    }
}
