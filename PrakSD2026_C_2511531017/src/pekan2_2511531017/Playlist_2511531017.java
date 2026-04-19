package pekan2_2511531017;

import java.util.*;

public class Playlist_2511531017 {

    public static void tampilkanMenu_1017() {
        System.out.println("\n=== Playlist Musik NIM: 2511531017 ===");
        System.out.println("1. Tambah Lagu");
        System.out.println("2. Lihat Playlist");
        System.out.println("3. Hapus Lagu");
        System.out.println("4. Keluar");
    }

    public static void tambahLagu_1017(ArrayList<Musik_2511531017> list, Scanner sc) {
        System.out.print("Masukan Judul: ");
        String judul_1017 = sc.nextLine();
        System.out.print("Masukan Penyanyi: ");
        String penyanyi_1017 = sc.nextLine();
        System.out.print("Masukan Durasi (detik): ");
        Integer durasi_1017 = sc.nextInt();
        sc.nextLine();

        list.add(new Musik_2511531017(judul_1017, penyanyi_1017, durasi_1017));
        System.out.println("Data berhasil ditambahkan!");
    }

    public static void tampilkanPlaylist_1017(ArrayList<Musik_2511531017> list_1017) {
        if (list_1017.isEmpty()) {
            System.out.println("Playlist kosong.");
        } else {
            System.out.println("Daftar Lagu:");
            for (Musik_2511531017 lagu_1017 : list_1017) {
                System.out.println(lagu_1017);
            }
        }
    }

    public static void hapusLagu_1017(ArrayList<Musik_2511531017> list_1017, Scanner sc) {
        System.out.print("Masukan Judul Lagu yang dihapus: ");
        String judulHapus_1017 = sc.nextLine();

        boolean removed = list_1017.removeIf(lagu_1017 -> lagu_1017.judul.equalsIgnoreCase(judulHapus_1017));

        if (removed) {
            System.out.println("Lagu \"" + judulHapus_1017 + "\" berhasil dihapus.");
        } else {
            System.out.println("Lagu tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        ArrayList<Musik_2511531017> playlist_1017 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            tampilkanMenu_1017();
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    tambahLagu_1017(playlist_1017, scanner);
                    break;
                case 2:
                    tampilkanPlaylist_1017(playlist_1017);
                    break;
                case 3:
                    hapusLagu_1017(playlist_1017, scanner);
                    break;
                case 4:
                    System.out.println("Keluar dari playlist.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (choice != 4);

        scanner.close();
    }
}