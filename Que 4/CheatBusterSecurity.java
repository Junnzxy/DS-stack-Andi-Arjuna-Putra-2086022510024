import java.util.Arrays;
import java.util.Scanner;

public class CheatBusterSecurity {
    public static void main(String[] args) {
        // Membaca satu baris input sebagai string
        try (Scanner sc = new Scanner(System.in)) {
            // Membaca satu baris input sebagai string
            if (!sc.hasNextLine()) return;
            String line = sc.nextLine();
            
            // Memecah string menjadi array berdasarkan spasi
            String[] parts = line.split("\\s+");
            int[] numbers = new int[parts.length];
            
            // Mengubah string menjadi integer
            for (int i = 0; i < parts.length; i++) {
                numbers[i] = Integer.parseInt(parts[i]);
            }
            
            // Proses "Stacking Formation Injection" (Pengurutan)
            Arrays.sort(numbers);
            
            // Menampilkan hasil kode rahasia yang sudah terurut
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + (i == numbers.length - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
}