import java.util.Scanner;

/**
 * Created by ZacharyChang.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sBuilder = new StringBuilder("\n");
        while (scanner.hasNext()) {
            sBuilder.append(scanner.nextLine()).append("\n");
        }
        scanner.close();
        throw new Exception(sBuilder.toString());
    }
}