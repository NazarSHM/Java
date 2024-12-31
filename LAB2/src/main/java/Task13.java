public class Task13 {
    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15}; // Вихідний масив
        boolean isArithmetic = true;
        int diff = a[1] - a[0]; // Різниця прогресії

        for (int i = 2; i < a.length; i++) {
            if (a[i] - a[i - 1] != diff) {
                isArithmetic = false;
                break;
            }
        }

        if (isArithmetic) {
            System.out.println("Масив є арифметичною прогресією.");
        } else {
            System.out.println("Масив не є арифметичною прогресією.");
        }
    }
}
