/*
Description
我要对习题进行分类，
只要我能1分钟做出来的题目，就是D等级的题目。
我所花时间大于1分钟小于等于两分钟的题目是C级题目。
除此之外，我能在3分钟之内（含3分钟）完成，我将他归为B级题目，
除此之外，10分钟内解决归为A。
否则归为S，（所有人都别想做出来！！！）

现在问S级到D级的题目分别有多少个(从高级到低级)

Input
多组数据，每组第一行，一个n（1<=n<=100000）
之后一行n个数，表示第i个题目所花的时间(min,每个绝对不超过60分钟)

Output
n行，每行一个数。

Sample Input
7
34 2 4 1 1 4 56

Sample Output
2
2
0
1
2

 */
package contest2;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemN {
    private static int level[] = {0, 0, 0, 0, 0}; //D C B A S

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num, n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                num = scanner.nextInt();
                checkScore(num);
            }
            printArray();
            clearArray();
        }
        scanner.close();
    }

    public static void checkScore(int n) {
        if (n <= 1) {
            level[4]++;
        } else if (n <= 2) {
            level[3]++;
        } else if (n <= 3) {
            level[2]++;
        } else if (n <= 10) {
            level[1]++;
        } else {
            level[0]++;
        }
    }

    public static void printArray() {
        for (int i = 0; i < 5; i++) {
            System.out.println(level[i]);
        }
    }

    public static void clearArray() {
        level = new int[]{0, 0, 0, 0, 0};
    }
}
/* C Version(Passed)
#include<stdio.h>

int main()
{
	int n, level[5] = { 0,0,0,0,0 };
	while (scanf_s("%d", &n)!=EOF) {
		short num;
		for (int i = 0; i < n; i++)
		{
			scanf_s("%hd", &num);
			if (num <= 1)
			{
				level[4]++;
			}
			else if (num <= 2)
			{
				level[3]++;
			}
			else if (num <= 3)
			{
				level[2]++;
			}
			else if (num <= 10) {
				level[1]++;
			}
			else
			{
				level[0]++;
			}
		}
		for (int i = 0; i < 5; i++)
		{
			printf("%d\n", level[i]);
			level[i] = 0;
		}
	}
}


 */