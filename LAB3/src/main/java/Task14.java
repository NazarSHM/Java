import java.util.Scanner;

public class Task14 {
    public static String encryptDecrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char encryptedChar = (char) (text.charAt(i) ^ key.charAt(i));
            result.append(encryptedChar);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть текст для шифрування: ");
        String text = scanner.nextLine();
        System.out.print("Введіть ключ такої ж довжини: ");
        String key = scanner.nextLine();

        if (key.length() != text.length()) {
            System.out.println("Помилка: довжина ключа повинна дорівнювати довжині тексту.");
            return;
        }

        String encryptedText = encryptDecrypt(text, key);
        System.out.println("Зашифрований текст: " + encryptedText);

        String decryptedText = encryptDecrypt(encryptedText, key);
        System.out.println("Розшифрований текст: " + decryptedText);
    }
}
