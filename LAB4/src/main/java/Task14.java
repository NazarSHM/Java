import java.util.*;

class LibraryAbonent {
    private String lastName;
    private String firstName;
    private String address;

    public LibraryAbonent(String lastName, String firstName, String address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + ", Address: " + address;
    }
}

public class Task14 {
    public static void main(String[] args) {
        HashMap<Integer, LibraryAbonent> abonents = new HashMap<>();

        // Початкові записи
        abonents.put(1234567, new LibraryAbonent("Smith", "John", "123 Main St"));
        abonents.put(7654321, new LibraryAbonent("Doe", "Jane", "456 Elm St"));
        abonents.put(2345678, new LibraryAbonent("Brown", "Charlie", "789 Oak St"));
        abonents.put(3456789, new LibraryAbonent("White", "Emily", "321 Pine St"));
        abonents.put(4567890, new LibraryAbonent("Black", "Michael", "654 Cedar St"));

        // Видалення абонента
        System.out.println("Before deletion:");
        abonents.forEach((phone, abonent) -> System.out.println("Phone: " + phone + ", " + abonent));
        abonents.remove(1234567); // Видалення за номером телефону

        System.out.println("\nAfter deletion:");
        abonents.forEach((phone, abonent) -> System.out.println("Phone: " + phone + ", " + abonent));

        // Сортування за прізвищем
        TreeMap<String, LibraryAbonent> sortedAbonents = new TreeMap<>();
        abonents.forEach((phone, abonent) -> sortedAbonents.put(abonent.getLastName(), abonent));

        System.out.println("\nSorted by Last Name:");
        sortedAbonents.forEach((lastName, abonent) -> System.out.println(lastName + ": " + abonent));
    }
}
