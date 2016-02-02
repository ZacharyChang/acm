/*
Description
2020年，BobLee，cms等大牛回报母校，给WUST盖了一栋大楼。剪彩的那天大牛们纷纷来到现场。看着自己掏钱捐助的大楼，BobLee觉得很有成就感。
在参观的时候，看到霸气的电梯，身为算法大神的BobLee决定以此来考考学弟学妹的速算能力，决定问一个问题，最快回答正确答案的同学将获得
iPhone21S一部，聪明的小明非常想要这部iphone，你能帮助他吗？
问题是：电梯一开始在0层，每上一层花费6S，每下一层花费4S，到了目标楼层后会停留5S时间，现给你需要依次到的n层楼，请算出一共需要多少
时间？（楼高200层，n<=200）

Input
多组数据。

每组首先是一个n，接下来n个数代表依次停的层数。

Output
每组输出一行，代表总用时

Sample Input
3 1 2 3
2 5 78
0

Sample Output
33
478
0

HINT
如果下一层是当前层，则在当前层多待5S


 */
package contest2;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class PorblemP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, time[];
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            if (n == 0) {
                System.out.println(0);
            } else {
                time = new int[n];
                for (int i = 0; i < n; i++) {
                    time[i] = scanner.nextInt();
                }
                System.out.println(getTime(time));
            }
        }
        scanner.close();
    }

    public static int getTime(int floor[]) {

        int time = floor[0] * 6 + 5;
        for (int i = 1; i < floor.length; i++) {
            if (floor[i] == floor[i - 1]) {
                time += 5;
            } else if (floor[i] > floor[i - 1]) {
                time += (floor[i] - floor[i - 1]) * 6 + 5;
            } else {
                time += (floor[i - 1] - floor[i]) * 4 + 5;
            }
        }
        return time;
    }
}
