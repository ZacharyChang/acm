/*
Description
已有一个已排好的9个元素的数组，今输入一个数要求按原来排序的规律将它插入数组中。
Input
第一行，原始数列。 第二行，需要插入的数字。
Output
排序后的数列
Sample Input
1 7 8 17 23 24 59 62 101
50

Sample Output
1
7
8
17
23
24
50
59
62
101
 */
package contest4;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemO {
    public static void main(String[] args) {
        int array[] = new int[9];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            array[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        printArray(insertedArray(array, num));
        scanner.close();
    }

    public static int[] insertedArray(int array[], int num) {
        int length = array.length;
        int insertedArray[] = new int[length + 1];
        int position = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] < num) {
                if (i == length - 1) {
                    position = length;
                    break;
                } else if (array[i + 1] >= num) {
                    position = i + 1;
                    break;
                } /* else continue into next loop */
            } else {
                position = i;
                break;
            }
        }

        insertedArray[position] = num;
        System.arraycopy(array, 0, insertedArray, 0, position);
        System.arraycopy(array, position + 1 - 1, insertedArray, position + 1, length + 1 - (position + 1));

        return insertedArray;
    }

    public static void printArray(int array[]) {
        for (int n : array) {
            System.out.println(n);
        }
    }
}
