package pekan3_2511531017;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511531017 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Website_2511531017> history_1017 = new Stack<>();

        int pilihan_1017;

        do {
            System.out.println("\n=== Browser History NIM: 2511531017 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan_1017 = input.nextInt();
            input.nextLine();

            switch (pilihan_1017) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul_1017 = input.nextLine();

                    System.out.print("Masukkan URL: ");
                    String url_1017 = input.nextLine();

                    Website_2511531017 web = new Website_2511531017(judul_1017, url_1017);
                    history_1017.push(web);

                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    if (!history_1017.isEmpty()) {
                        Website_2511531017 hapus = history_1017.pop();
                        System.out.println("Kembali dari: " + hapus.getJudul_1017());
                    } else {
                        System.out.println("History kosong!");
                    }
                    break;

                case 3:
                    if (!history_1017.isEmpty()) {
                        Website_2511531017 atas = history_1017.peek();
                        System.out.println("Halaman Aktif:");
                        System.out.println("Judul: " + atas.getJudul_1017());
                        System.out.println("URL: " + atas.getUrl_1017());
                    } else {
                        System.out.println("Tidak ada halaman aktif!");
                    }
                    break;

                case 4:
                    System.out.println("Keluar dari website");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_1017 != 4);

        input.close();
    }
}