package contest1; /**
 Description
 打印Helloworld字符串是每一位ACMer的起点，然而随着每一位ACMer的成长，每一位ACMer进入了一个更高的层次，所要做的事情也越来越难，今天我们要做的就是从给出的字符串选取字符来尽量多的拼凑出Helloworld这个单词。

 Input
 多组数据测试。
 输入包括一行，每行包括一个字符串，由单词，数字，空格组成，长度不超过100。

 Output
 每组数据输出一行，每一行输出能够拼凑出的Helloworld的最大数量。

 Sample Input
 Helloworld
 1d2l3r4o5w6o7l8l9e10H1d2l3r4o5w6o7l8l9e10H

 Sample Output
 1
 2
 */

import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemO {
    // H->1 e->1 l->3 o->2 w->1 r->1 d->1
    public static int helloworld[] = new int[]{0,0,0,0,0,0,0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            if (str.equals("\n")) {
                break;
            } else {
                for (int i = 0; i < str.length(); i++) {
                    ch = str.charAt(i);
                    addChar(ch);
                }
                System.out.println(countNum());
                clearArray();
            }
        }
        scanner.close();
    }

    public static void addChar(char ch){
        switch (ch){
            case 'H':
                helloworld[6]++;
                break;
            case 'e':
                helloworld[5]++;
                break;
            case 'l':
                helloworld[4]++;
                break;
            case 'o':
                helloworld[3]++;
                break;
            case 'w':
                helloworld[2]++;
                break;
            case 'r':
                helloworld[1]++;
                break;
            case 'd':
                helloworld[0]++;
                break;
        }
    }

    public static void clearArray(){
        for(int i=0;i<helloworld.length;i++){
            helloworld[i]=0;
        }
    }

    public static int countNum(){
        int min=helloworld[6];
        if(min>helloworld[5]){
            min=helloworld[5];
        }
        if(min>(helloworld[4]/3)){
            min=helloworld[4]/3;
        }
        if(min>(helloworld[3]/2)){
            min=helloworld[3]/2;
        }
        if(min>helloworld[2]){
            min=helloworld[2];
        }
        if(min>helloworld[1]){
            min=helloworld[1];
        }
        if(min>helloworld[0]){
            min=helloworld[0];
        }
        return min;
    }
}
