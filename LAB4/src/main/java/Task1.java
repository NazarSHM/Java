import java.util.*;

class Abonent {
    private String lastName;
    private String firstName;
    private String address;

    public Abonent(String lastName, String firstName, String address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + ", Address: " + address;
    }
}

public class Task1 {
    public static void main(String[] args) {
        TreeMap<Integer, Abonent> abonents = new TreeMap<>();

        // Початкові записи
        abonents.put(1234567, new Abonent("Smith", "John", "123 Main St"));
        abonents.put(7654321, new Abonent("Doe", "Jane", "456 Elm St"));
        abonents.put(2345678, new Abonent("Brown", "Charlie", "789 Oak St"));
        abonents.put(3456789, new Abonent("White", "Emily", "321 Pine St"));
        abonents.put(4567890, new Abonent("Black", "Michael", "654 Cedar St"));

        // Сортування за прізвищем
        abonents.entrySet().stream()
                .sorted(Comparator.comparing(e -> e.getValue().getLastName()))
                .forEach(e -> System.out.println("Phone: " + e.getKey() + ", " + e.getValue()));
    }
}
