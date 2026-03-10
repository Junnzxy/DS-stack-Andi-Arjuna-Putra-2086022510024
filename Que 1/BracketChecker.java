import java.util.Stack;

public class BracketChecker {

    public static boolean is_balanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Handle closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No opening bracket to match
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // Wrong type of match
                }
            }
        }
        // Balanced only if stack is empty at the end
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String balanced = "{[()]}";
        String unbalanced = "{[([)]]}";

        System.out.println(balanced + " -> " + is_balanced(balanced));   // true
        System.out.println(unbalanced + " -> " + is_balanced(unbalanced)); // false

        // Example: Add one bracket so it will NEVER be balanced
        String neverBalanced = "{[()]}]";
        System.out.println(neverBalanced + " -> " + is_balanced(neverBalanced)); // false
    }
} 