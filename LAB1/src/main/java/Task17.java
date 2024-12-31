import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        double average = (a + b + c + d) / 4.0;
        int nearestInteger = (int) Math.round(average);

        System.out.println("Average: " + average);
        System.out.println("Nearest integer: " + nearestInteger);
    }
}
