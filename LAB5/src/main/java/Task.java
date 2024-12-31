// Клас Дата
import java.time.LocalDate;

class Date {
    private LocalDate date;

    public Date(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }

    public void increment() {
        this.date = this.date.plusDays(1);
    }

    public void decrement() {
        this.date = this.date.minusDays(1);
    }

    public String getDate() {
        return date.toString();
    }

    public void setDate(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return "Date{" + "date=" + date + '}';
    }
}

// Клас Трикутник
class Triangle {
    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}

// Клас Час
class Time {
    private int hours, minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public String getTime() {
        return String.format("%02d:%02d", hours, minutes);
    }

    public void setTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "Time{" + "hours=" + hours + ", minutes=" + minutes + '}';
    }
}

// Клас Розклад
class Schedule {
    private String subject;
    private String classroom;
    private Time startTime;

    public Schedule(String subject, String classroom, Time startTime) {
        this.subject = subject;
        this.classroom = classroom;
        this.startTime = startTime;
    }

    public String timeUntilLesson(int currentHours, int currentMinutes) {
        int startInMinutes = startTime.hours * 60 + startTime.minutes;
        int currentInMinutes = currentHours * 60 + currentMinutes;
        int difference = startInMinutes - currentInMinutes;
        return difference > 0 ? "Time until lesson: " + difference + " minutes" : "Lesson started.";
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "subject='" + subject + '\'' +
                ", classroom='" + classroom + '\'' +
                ", startTime=" + startTime +
                '}';
    }
}

// Базовий клас Комп'ютер
class Computer {
    private String name;
    private double processorFrequency;
    private int cores;
    private int ram;
    private int storage;

    public Computer(String name, double processorFrequency, int cores, int ram, int storage) {
        this.name = name;
        this.processorFrequency = processorFrequency;
        this.cores = cores;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", processorFrequency=" + processorFrequency +
                ", cores=" + cores +
                ", ram=" + ram +
                ", storage=" + storage +
                '}';
    }
}

// Пов'язаний клас Ноутбук
class Laptop extends Computer {
    private double screenDiagonal;
    private double weight;
    private int batteryCapacity;

    public Laptop(String name, double processorFrequency, int cores, int ram, int storage, double screenDiagonal, double weight, int batteryCapacity) {
        super(name, processorFrequency, cores, ram, storage);
        this.screenDiagonal = screenDiagonal;
        this.weight = weight;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Laptop{" +
                "screenDiagonal=" + screenDiagonal +
                ", weight=" + weight +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
