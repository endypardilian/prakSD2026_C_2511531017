package pekan4_2511531017;

import java.util.*;

public class AntrianLoket_2511531017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue_2511531017 antrian = new Queue_2511531017(10);

        int pilihan;
        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = input.nextLine();
                    antrian.enqueue_1017(nama);
                    break;
                case 2:
                    antrian.dequeue_1017();
                    break;
                case 3:
                    antrian.display_1017();
                    break;
                case 4:
                    antrian.reverse_1017();
                    antrian.display_1017();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        input.close();
    }
}