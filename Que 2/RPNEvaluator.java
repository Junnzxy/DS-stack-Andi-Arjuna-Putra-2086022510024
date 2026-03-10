import java.util.Stack;

public class RPNEvaluator {
    public static int evaluateRpn(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                // Ambil dua angka terakhir dari stack
                int b = stack.pop();
                int a = stack.pop();
                
                // Hitung hasil berdasarkan operator
                switch (token) {
                    case "+" -> stack.push(a + b);
                    case "-" -> stack.push(a - b);
                    case "*" -> stack.push(a * b);
                    case "/" -> // Pembagian integer di Java otomatis melakukan truncating toward zero
                        stack.push(a / b);
                }
            } else {
                // Jika token adalah angka, masukkan ke stack
                stack.push(Integer.valueOf(token));
            }
        }
        // Hasil akhir berada di puncak stack
        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return "+-*/".contains(token);
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println("Output: " + evaluateRpn(tokens)); // Output: 9
    }
}