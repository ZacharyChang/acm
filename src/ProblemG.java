import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class ProblemG {
    protected static long longestCount(long[] array) {
        if(array.length==1){
            return 1;
        }else if(array.length==2){
            if(array[0]<=array[1]){
                return 2;
            }
            return 1;
        }
        int mediumPosition = array.length / 2;
        long[] array1 = Arrays.copyOfRange(array, 0, mediumPosition);
        long[] array2 = Arrays.copyOfRange(array, mediumPosition, array.length);
        if (array1[array1.length-1] > array2[0]) {
            if (longestCount(array1) >= longestCount(array2)) {
                return longestCount(array1);
            } else {
                return longestCount(array2);
            }
        } else {
            long max = 1;
            long temp = 1;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= array[i + 1]) {
                    max++;
                    if (max > temp) {
                        temp = max;
                    }
                } else {
                    max = 1;
                }
            }
            return temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            if (str.equals("\n")) {
                break;
            } else {
                int number = Integer.parseInt(str);
                long[] array = new long[number];
                for (int i = 0; i < number; i++) {
                    array[i] = scanner.nextInt();
                }
                System.out.println(longestCount(array));
            }
        }
        scanner.close();
    }
}
