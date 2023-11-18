import java.util.Stack;
public class Duplicate{
    public static boolean check(String str) {
        Stack<Character> s = new Stack<>(); // Create an empty stack

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character from the string

            if (ch == ')') { // If the current character is a closing parenthesis ')'
            int count = 0; // Initialize a counter to keep track of the number of opening parentheses

            while (s.pop() != ')') { // Pop characters from the stack until we find a matching opening parenthesis '('
                count++; // Increment the counter
            }

            if (count < 1) { // If there are no opening parentheses to match the closing parenthesis
                return true; // The expression is not balanced
            }
            } else { // If the current character is not a closing parenthesis
            s.push(ch); // Push the character onto the stack
            }
        }

        return true; // The expression is balanced
        }

    public static void main(String args[]){
        String str="((a+b))";
        String str1="(a-b)";
        System.out.println(check(str));
        System.out.println(check(str1));
    }
}