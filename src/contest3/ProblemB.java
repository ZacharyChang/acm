package contest3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ZacharyChang.
 */
public class ProblemB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayA = 0, dayB = 0;
        while (scanner.hasNextLine()) {
            String dateA = scanner.nextLine();
            Pattern pattern = Pattern.compile("(\\d+)-(\\d+)-(\\d+)");
            Matcher matcher = pattern.matcher(dateA);
            if (matcher.find()) {
                dayA = Integer.parseInt(matcher.group(3));
            }
            String dateB = scanner.nextLine();
            matcher = pattern.matcher(dateB);
            if (matcher.find()) {
                dayB = Integer.parseInt(matcher.group(3));
            }
            System.out.println(dayB - dayA - 1);
        }
    }
}
