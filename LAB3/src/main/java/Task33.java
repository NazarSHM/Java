import java.util.ArrayList;

public class Task33 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Будь ласка, передайте аргументи для аналізу.");
            return;
        }

        System.out.println("Кількість заданих аргументів: " + args.length);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (String arg : args) {
            if (isInteger(arg)) {
                int number = Integer.parseInt(arg);
                numbers.add(number);
                System.out.println("Аргумент: " + arg + " (Тип: Число)");
            } else {
                System.out.println("Аргумент: " + arg + " (Тип: Рядок)");
            }
        }

        if (!numbers.isEmpty()) {
            int maxNumber = numbers.stream().max(Integer::compareTo).orElseThrow();
            System.out.println("Кількість аргументів-чисел: " + numbers.size());
            System.out.println("Максимальне число серед аргументів: " + maxNumber);
        } else {
            System.out.println("Аргументи-числа відсутні.");
        }
    }

    private static boolean isInteger(String s) {
        if (s == null || s.isEmpty()) return false;
        char firstChar = s.charAt(0);
        if (!Character.isDigit(firstChar) && firstChar != '+' && firstChar != '-') return false;
        for (int i = 1; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }
}
