package collection;

import java.util.Stack;

public class StackEx2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Kolaia");
        stack.push("Tolaia");
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("Katia");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println(stack);

        }
    }
}
