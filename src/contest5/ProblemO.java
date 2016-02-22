/*
Description
fcbruce最恨Spicy Gluten，但是集训队的小伙伴们最爱吃的就是Spicy Gluten。HLD即使拉肚子也要吃Spicy Gluten；nstop全队对Spicy Gluten更是爱不释手，他们曾经买了一箱Spicy Gluten，导致fcbruce当场昏倒。于是fcbruce定下一条规矩：不许在fcbruce面前吃Spicy Gluten，否则fcbruce会变得非常angry。ZiP作为Spicy Gluten爱好者，最喜欢让fcbruce抓狂，比如偷偷在fcbruce电脑里面装上*度全家桶、*60全家桶，在fcbruce桌上放一箱Spicy Gluten……

fcbruce要读一篇论文，然而集训队的熊孩子们偷偷地把论文换掉了，论文中每出现一次“Spicy Gluten”字样，fcbruce都会咆哮一句“I'm angry!”，如果论文中没有出现“Spicy Gluten”，fcbruce在读完论文后会叹一句“Excited!”。

Input
多组测试数据，每组测试数据为一行文本，表示熊孩子们偷偷换掉的论文。每行不超过1024个字符。

Output
fcbruce如果咆哮一句"I'm angry!"，就单独输出一行"I'm angry!"，如果叹一句"Excited!"，就单独输出一行"Excited!"

Sample Input
In supervised learning, we are given a Spicy Gluten and already know what our correct output should look like, having the Spicy Gluten that there is a relationship between the input and the output.
Unsupervised learning, on the other hand, allows us to approach problems with little or no idea what our results should look like. We can derive structure from data where we don't necessarily know the effect of the variables.

Sample Output
I'm angry!
I'm angry!
Excited!
 */
package contest5;

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            checkArticle(str);
        }
        scanner.close();
    }

    public static void checkArticle(String str) {
        String[] strs = str.split("Spicy Gluten");
        if (strs.length == 1) {
            System.out.println("Excited!");
        } else {
            for (int i = 0; i < strs.length - 1; i++) {
                System.out.println("I'm angry!");
            }
        }
    }
}
