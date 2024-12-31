import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        int[] a = {3, 7, 1, 9, 4}; // Вихідний масив
        int max = Arrays.stream(a).max().getAsInt(); // Знаходимо максимальне значення
        int[] b = Arrays.stream(a).map(element -> max - element).toArray(); // Створюємо масив b

        System.out.println("Масив a: " + Arrays.toString(a));
        System.out.println("Масив b: " + Arrays.toString(b));
    }
}
