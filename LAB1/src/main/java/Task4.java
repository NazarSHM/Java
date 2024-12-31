import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();

        int reversed = reverseNumber(number);
        double logValue = Math.log(reversed);

        System.out.println("Reversed number: " + reversed);
        System.out.println("Natural logarithm: " + logValue);
    }

    private static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}
