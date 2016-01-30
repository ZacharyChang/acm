/*
Description
Your task is to Calculate a + b.

Input
Input contains an integer N in the first line, and then N lines follow. Each line consists of a pair of integers a and b, separated by a space, one pair of integers per line.

Output
For each pair of input integers a and b you should output the sum of a and b in one line, and with one line of output for each line in input.

Sample Input
2
1 5
10 20

Sample Output
6
30

 */
package contest2;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemA {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int n = scanner.nextInt();
            for(int i=0;i<n;i++){
                int num1=scanner.nextInt();
                int num2=scanner.nextInt();
                System.out.println(sum(num1, num2));
            }
        }
        scanner.close();
    }
}
