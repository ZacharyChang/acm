/*
Description
数组是在程序设计中，为了处理方便， 把具有相同类型的若干变量按有序的形式组织起来的一种形式。这些按序排列的同类数据元素的集合称为数组
数组类型说明 在Ｃ语言中使用数组必须先进行类型说明。 　　数组说明的一般形式为： 类型说明符 数组名 [常量表达式]，……； 其中，类型说明符是任一种基本数据类型或构造数据类型。 数组名是用户定义的数组标识符。 方括号中的常量表达式表示数据元素的个数，也称为数组的长度。
例
int a[10]; 说明整型数组a，有10个元素。 　　float b[10],c[20]; 说明实型数组b，有10个元素，实型数组c，有20个元素。 　　char ch[20]; 说明字符数组ch，有20个元素。

Input
多组测试数据。第一行输入一个整数T表示测试数据组数
每组首先输入1个整数n,然后输入n个整数(不大于20）

Output
对于每组测试数据按照输入相反的顺序输出n个数据

Sample Input
2
3
1 2 3
5
2 3 1 4 5

Sample Output
3 2 1
5 4 1 3 2
 */
package contest2;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[];
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            array = new int[num];
            for (int j = 0; j < num; j++) {
                array[j] = scanner.nextInt();
            }
            oppPrint(array);
        }
        scanner.close();
    }

    public static void oppPrint(int array[]) {
        System.out.print(array[array.length - 1]);
        for (int i = 1; i < array.length; i++) {
            System.out.print(" " + array[array.length - i - 1]);
        }
        System.out.println();
    }

}
