/*
Description
输入10个数字，然后逆序输出。
Input
十个整数
Output
逆序输出，空格分开
Sample Input
1 2 3 4 5 6 7 8 9 0

Sample Output
0 9 8 7 6 5 4 3 2 1

HINT
数组？堆栈？
 */
package contest4;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ZacharyChang.
 */
public class ProblemP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(scanner.nextInt());
        }
        while (stack.size() > 1) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println(stack.pop());
        scanner.close();
    }
}
