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

Asumsi dan Kasus Khusus (Edge Cases)
Asumsi
- Tipe Data: Semua perhitungan gaji menggunakan double untuk mendukung angka desimal.
- Akses Modifier: Menggunakan protected pada kelas induk agar atribut dapat diakses langsung oleh kelas anak namun tetap aman dari luar.
- Konstruktor: Setiap subkelas wajib memanggil super() untuk mengirim data ke kelas induk.

Kasus Khusus (Edge Cases)
- Tanpa Override: Jika subkelas tidak melakukan override (seperti pada metode attendMeeting), program secara otomatis menggunakan logika milik kelas induk.
- Referensi Induk (Upcasting): Saat menggunakan Vehicle v2 = new Car(), variabel v2 hanya bisa mengakses metode yang ada di kelas Vehicle. Jika Car punya metode baru (misal: bukaSunroof()), metode itu tidak bisa dipanggil melalui v2.
- Dynamic Dispatch: Java akan selalu mencari metode paling spesifik saat runtime. Jika objek aslinya adalah Programmer, maka metode work() milik Programmer yang akan dijalankan, bukan milik Employee.
