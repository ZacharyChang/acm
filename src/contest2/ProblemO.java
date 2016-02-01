/*  KnapsackProblem
Description
Farmer John和小伙伴们在玩一款RPG游戏，每轮游戏一开始大家共有V块水晶，有n个不同的作战单位，（你知道的，有的是人类，有的是非人类）,每个作战单位都需要一定的水晶来购买。要用这V块水晶，来挑选出一些怪物来进行游戏，现在Farmer John作为老大，大家都听他的，他要选出攻击力之和最高的 作战单位组合。
你能告诉他最大攻击力之和是多少吗？

Input
多组数据，每组：
第一行两个数n （1<=n<=1000）,V（1<=V<=1000）代表兵种数目，和水晶数目。
之后n行，每行2个数，cost[i]和atk[i]（1<=cost[i]、atk[i]<=1000）分别表示编号为i的每个单位选择时所需消耗的水晶和它的攻击力。

Output
最大攻击力之和

Sample Input
2  2
1  6
2  3
2  3
1  6
2  3

Sample Output
6
9
 */
package contest2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemO {

    private Knapsack[] bags;
    private int totalWeight;
    private int n;
    private int[][] bestValues;
    private int bestValue;
    private ArrayList<Knapsack> bestSolution;


    public ProblemO(Knapsack[] bags, int totalWeight) {
        this.bags = bags;
        this.totalWeight = totalWeight;
        this.n = bags.length;
        if (bestValues == null) {
            bestValues = new int[n + 1][totalWeight + 1];
        }
    }

    public static class Knapsack {
        private int weight;
        private int value;

        public Knapsack(int weight, int value) {
            this.value = value;
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }

        public int getValue() {
            return value;
        }
    }

    public void solve() {

        for (int j = 0; j <= totalWeight; j++) {
            for (int i = 0; i <= n; i++) {
                if (i == 0 || j == 0) {
                    bestValues[i][j] = 0;
                } else {
                    if (j < bags[i - 1].getWeight()) {
                        bestValues[i][j] = bestValues[i - 1][j];
                    } else {
                        int iweight = bags[i - 1].getWeight();
                        int ivalue = bags[i - 1].getValue();
                        bestValues[i][j] =
                                Math.max(bestValues[i - 1][j], ivalue + bestValues[i - 1][j - iweight]);
                    }
                }
            }
        }
        if (bestSolution == null) {
            bestSolution = new ArrayList<>();
        }
        int tempWeight = totalWeight;
        for (int i = n; i >= 1; i--) {
            if (bestValues[i][tempWeight] > bestValues[i - 1][tempWeight]) {
                bestSolution.add(bags[i - 1]);  // bags[i-1] 表示第 i 个背包
                tempWeight -= bags[i - 1].getWeight();
            }
            if (tempWeight == 0) break;
        }
        bestValue = bestValues[n][totalWeight];
    }

    public int getBestValue() {
        return bestValue;
    }

    public int[][] getBestValues() {
        return bestValues;
    }

    public ArrayList<Knapsack> getBestSolution() {
        return bestSolution;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int v = scanner.nextInt();
            Knapsack[] kps = new Knapsack[n];
            for (int i = 0; i < n; i++) {
                kps[i] = new Knapsack(scanner.nextInt(), scanner.nextInt());
            }
            ProblemO kp = new ProblemO(kps, v);
            kp.solve();
            System.out.println(kp.getBestValue());
        }
        scanner.close();
    }
}
