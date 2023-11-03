import java.util.ArrayList;

public class Stack { // Capitalized the class name for naming conventions
    static class Stacks { // Capitalized the class name for naming conventions
        static ArrayList<Integer> list = new ArrayList<>(); // Changed List to list, and made it non-static
        public static boolean isEmpty() {
            return list.isEmpty(); // Changed size() to isEmpty()
        }
        // Push
        public static void push(int data) {
            list.add(data);
        }
        // Pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1); // Changed size(-1) to size() - 1
            list.remove(list.size() - 1);
            return top;
        }
        // Peek
        public static int peek() {
            return list.get(list.size() - 1); // Changed size(-1) to size() - 1
        }

        public static void main(String args[]) {
            Stacks s = new Stacks(); // Removed unnecessary instantiation of the 'stack' class
            s.push(1);
            s.push(2);
            s.push(3);
            while (!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }
        }
    }

    public static void main(String[] args) {
        Stacks s = new Stacks();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
