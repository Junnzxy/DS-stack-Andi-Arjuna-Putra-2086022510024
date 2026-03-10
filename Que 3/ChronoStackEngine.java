import java.util.Scanner;

public class ChronoStackEngine {

    public static void main(String[] args) {
        // Pastikan ada input sebelum lanjut
        try (Scanner sc = new Scanner(System.in)) {
            // Pastikan ada input sebelum lanjut
            if (!sc.hasNextInt()) return;
            
            int n = sc.nextInt();
            StringBuilder finalOutput = new StringBuilder();
            
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    int target = sc.nextInt();
                    // Memanggil fungsi dan menggabungkan hasilnya
                    finalOutput.append(generateInstructions(target));
                }
            }
            
            // Mencetak semua instruksi sekaligus
            System.out.println(finalOutput.toString());
        }
    }

    public static String generateInstructions(int n) {
        if (n == 1) {
            return "1";
        }
        
        if (n % 2 == 0) {
            // Jika genap, gunakan pola: (n/2) lalu duplikat dan tambah
            return generateInstructions(n / 2) + "d+";
        } else {
            // Jika ganjil, gunakan pola: (n-1) lalu tambah 1 dan gabung
            return generateInstructions(n - 1) + "1+";
        }
    }
}