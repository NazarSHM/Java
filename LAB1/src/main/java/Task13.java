import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();

        int transformed = transformNumber(number);
        double squareRoot = Math.sqrt(transformed);

        System.out.println("Transformed number: " + transformed);
        System.out.println("Square root: " + squareRoot);
    }

    private static int transformNumber(int num) {
        int lastDigit = num % 10;
        int remainingDigits = num / 10;
        return lastDigit * 100 + remainingDigits;
    }
}
