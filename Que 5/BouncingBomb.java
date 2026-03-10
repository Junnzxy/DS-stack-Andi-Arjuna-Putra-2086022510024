import java.util.Scanner;
import java.util.Stack;

public class BouncingBomb {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            
            Stack<Integer> stack = new Stack<>();
            
            // Masukkan angka ke stack sambil dibagi 2
            while (n >= 1) {
                stack.push(n);
                n = n / 2;
            }
            
            // Keluarkan dari stack (LIFO) sehingga urutan jadi terkecil -> terbesar
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + (stack.isEmpty() ? "" : " "));
            }
            System.out.println();
        }
    }
}