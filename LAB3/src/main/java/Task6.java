import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введіть символ (або '=' для виходу): ");
            String input = scanner.nextLine();
            if ("=".equals(input)) {
                System.out.println("Програма завершена.");
                break;
            }
            if (input.length() != 1) {
                System.out.println("Будь ласка, введіть лише один символ.");
                continue;
            }
            char character = input.charAt(0);
            int unicode = (int) character;
            System.out.println("Код Юнікод для символу '" + character + "': " + unicode);
        }
        scanner.close();
    }
}
