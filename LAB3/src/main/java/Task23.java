import java.util.Arrays;

public class Task23 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Будь ласка, передайте аргументи для аналізу.");
            return;
        }

        System.out.println("Кількість аргументів: " + args.length);

        for (String arg : args) {
            if (arg.contains(",")) {
                String[] listItems = arg.split(",");
                System.out.println("Аргумент: " + arg + " (Тип: List)");
                System.out.println("Елементи списку: " + Arrays.toString(listItems));
            } else {
                System.out.println("Аргумент: " + arg + " (Тип: Single)");
            }
        }
    }
}
