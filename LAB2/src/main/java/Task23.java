import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Task23 {
    public static void main(String[] args) {
        int[] a = {3, 7, 1, 7, 3, 9, 1}; // Вихідний масив

        HashMap<Integer, List<Integer>> elementIndices = new HashMap<>();

        // Зберігаємо всі індекси для кожного значення
        for (int i = 0; i < a.length; i++) {
            elementIndices.putIfAbsent(a[i], new ArrayList<>());
            elementIndices.get(a[i]).add(i);
        }

        System.out.println("Рівні елементи з індексами:");
        for (int key : elementIndices.keySet()) {
            List<Integer> indices = elementIndices.get(key);
            if (indices.size() > 1) { // Якщо елемент зустрічається більше одного разу
                System.out.println("Значення: " + key + ", Індекси: " + indices);
            }
        }
    }
}
