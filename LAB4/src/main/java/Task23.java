import java.util.*;

class StackMember {
    private String programName;
    private int memorySize;
    private int priority;

    public StackMember(String programName, int memorySize, int priority) {
        this.programName = programName;
        this.memorySize = memorySize;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Program: " + programName + ", Memory: " + memorySize + "MB, Priority: " + priority;
    }
}

class PriorityStack {
    private LinkedList<StackMember> stack;

    public PriorityStack() {
        stack = new LinkedList<>();
    }

    public void add(StackMember member) {
        // Вставка з урахуванням пріоритету
        int index = 0;
        while (index < stack.size() && stack.get(index).getPriority() >= member.getPriority()) {
            index++;
        }
        stack.add(index, member);
    }

    public void viewStack() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("Current Stack:");
            stack.forEach(System.out::println);
        }
    }
}

public class Task23 {
    public static void main(String[] args) {
        PriorityStack priorityStack = new PriorityStack();

        // Початкові записи
        priorityStack.add(new StackMember("Program A", 512, 3));
        priorityStack.add(new StackMember("Program B", 256, 1));
        priorityStack.add(new StackMember("Program C", 1024, 2));
        priorityStack.add(new StackMember("Program D", 128, 5));
        priorityStack.add(new StackMember("Program E", 64, 4));

        System.out.println("Initial Stack:");
        priorityStack.viewStack();

        // Додавання нового запису
        priorityStack.add(new StackMember("Program F", 2048, 3));
        System.out.println("\nStack after adding a new element:");
        priorityStack.viewStack();
    }
}
