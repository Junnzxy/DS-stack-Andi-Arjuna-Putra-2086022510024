# DS-stack-Andi-Arjuna-Putra-2086022510024

Laporan Tugas Polimorfisme Java
Proyek ini berisi kumpulan kode program untuk mendemonstrasikan konsep Pewarisan (Inheritance) dan Polimorfisme pada bahasa pemrograman Java.

Daftar Kasus (Nomor)

Question 1 — Bracket Checker 
Implement is_balanced(s) to check whether brackets are balanced using a stack.

Question 2 — Reverse Polish Notation Evaluation
Implement evaluate_rpn(tokens) using a stack to evaluate postfix expressions.

Question 3 — Chrono Stack Engine (Stack Instruction Reconstruction)
Create a program that outputs the required instruction sequence based on the described temporal stack rules.

Question 4 — Cheat Buster Security System (Stack-Based Ordering)
Implement the process to generate the final ordered output using the described stack injection mechanism.

Question 5 — Operation Chastise (Stack-Based Counting)
Calculate when the bombs are to be dropped, to which you need to create a formula for it. Assuming the craft's n velocity directly translates to momentum upon drop, calculate the momentum from each of the bounce

Cara Kompilasi dan Menjalankan Program
Persyaratan
- Java Development Kit (JDK) terinstal.
- Terminal atau Command Prompt.

Step by step
1. Buka Terminal di folder tempat file .java berada.
2. Kompilasi semua file: javac *.java
3. Jalankan program: java *.java

Gemini said
Berikut adalah draf dokumentasi README.md yang disusun dengan bahasa jelas, langsung, dan informatif sesuai dengan standar instruksi Anda.

Panduan Penggunaan Program Java
Dokumen ini berisi instruksi teknis untuk menjalankan kode program, asumsi yang digunakan, serta penanganan kasus khusus dalam implementasi Pemrograman Berorientasi Objek (OOP).

Cara Kompilasi dan Menjalankan Program
Pastikan Java Development Kit (JDK) sudah terinstal dan Terminal atau Command Prompt Anda dapat mengenali perintah java.

Buka Terminal atau CMD.

Arahkan ke folder tempat file .java disimpan.

Kompilasi semua file sekaligus untuk memastikan keterhubungan antar kelas:
javac *.java

Jalankan kelas utama (Main Class) program:
java [NamaKelasUtama]
Contoh: java BouncingBomb atau java RPNEvaluator

Format Input dan Contoh Penggunaan
Program membaca input langsung dari terminal. Gunakan format berikut agar program berjalan dengan benar.

Masalah	Format Input	Contoh Input
- RPN Evaluator	Daftar string angka dan operator	2 1 + 3 *
- Chrono Engine	Jumlah target (n) diikuti angka target	2 5 10
- Bouncing Bomb	Satu angka integer	75
- Cheat Buster Baris angka acak dipisahkan spasi	42 9 17 63

Penjelasan Implementasi (5 Tantangan)
- RPN Evaluation: Menggunakan Stack<Integer> untuk menghitung notasi postfix. Angka dimasukkan ke tumpukan, dan saat operator ditemukan, dua angka teratas diambil untuk dihitung.
- Chrono Stack Engine: Menggunakan logika Recursive Divide & Conquer. Angka target dibangun dengan membagi dua secara terus menerus untuk meminimalkan jumlah instruksi d dan +.
- Cheat Buster Security: Menggunakan Arrays.sort() untuk mengurutkan kode acak. Logikanya memastikan angka terkecil masuk ke memori terlebih dahulu sesuai protokol keamanan.
- Bouncing Bomb Momentum: Menggunakan Stack untuk membalikkan urutan hasil pembagian. Kita membagi angka input dengan 2 berulang kali, lalu menampilkannya dari hasil terkecil ke terbesar menggunakan prinsip LIFO.
- Struktur Dasar OOP: Menggunakan Constructor dan Inheritance (Pewarisan) untuk mengelola data objek secara hierarkis, seperti pada contoh Employee dan Programmer.

Kasus Khusus (Edge Cases)
- Truncation pada RPN: Pembagian integer pada Java otomatis melakukan truncate toward zero. Contoh: 13 / 5 = 2 dan -13 / 5 = -2.
- Distorsi Waktu (Chrono Engine): Instruksi + mengurangi elemen lain di stack. Solusi kita menangani ini dengan hanya menyisakan satu elemen aktif di stack selama proses pembangunan angka agar data tidak rusak.
= Input Dinamis pada Cheat Buster: Program menggunakan .split("\\s+") untuk menangani jumlah spasi yang tidak menentu antar angka pada input kode rahasia.
- Urutan LIFO pada Bouncing Bomb: Jika input adalah 1, stack hanya akan berisi satu angka. Proses pop() harus dipastikan berhenti saat stack kosong untuk menghindari EmptyStackException.
- Polimorfisme (OOP): Jika menggunakan referensi Parent untuk objek Child (misal: Employee p = new Programmer()), program tetap menjalankan metode work() milik Programmer karena mekanisme Dynamic Dispatch.

Moohon maaf sebelumnya pak saya belum bisa melampirkan report karena terkendala di ACC asdos, saya belum konsul jadi saya belum bisa mengumpulkan report saya.
codingan ini mengambil ref dari: w3school, geeksforgeeks, 
codingan ini hampir semuanya di buat oleh AI (Gemini dan Deepseek)
