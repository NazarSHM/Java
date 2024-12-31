import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number A: ");
        int A = scanner.nextInt();

        int A2 = A * A;
        int A4 = A2 * A2;
        int A8 = A4 * A4;

        System.out.println("A^2 = " + A2);
        System.out.println("A^4 = " + A4);
        System.out.println("A^8 = " + A8);
    }
}
