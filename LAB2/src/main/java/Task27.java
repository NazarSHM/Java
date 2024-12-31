import java.util.ArrayList;
import java.util.List;

public class Task27 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 2, 6, 4, 1};

        List<Integer> indices = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                count++;
                indices.add(i);
            }
        }

        System.out.println("Кількість рівних елементів: " + count);
        System.out.println("Індекси рівних елементів: " + indices);
    }
}
