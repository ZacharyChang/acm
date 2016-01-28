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
