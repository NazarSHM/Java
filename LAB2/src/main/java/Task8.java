import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] a = {3, 7, 1, 9, 4}; // Вихідний масив
        Arrays.sort(a); // Сортуємо масив
        int minDifference = Integer.MAX_VALUE;

        for (int i = 1; i < a.length; i++) {
            int diff = a[i] - a[i - 1];
            if (diff < minDifference) {
                minDifference = diff;
            }
        }

        System.out.println("Найменша різниця між двома елементами: " + minDifference);
    }
}