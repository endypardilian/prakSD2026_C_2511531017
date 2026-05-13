package pekan6_2511531017;
import java.util.*;
public class Musik_2511531017 {

    Lagu_2511531017 head_1017 = null;
    Lagu_2511531017 tail_1017 = null;
    public void tambahLagu_1017(String judul_1017, String penyanyi_1017) {
        Lagu_2511531017 baru_1017 = new Lagu_2511531017(judul_1017, penyanyi_1017);
        if (head_1017 == null) {
            head_1017 = baru_1017;
            tail_1017 = baru_1017;
        } else {
            tail_1017.next_1017 = baru_1017;
            baru_1017.prev_1017 = tail_1017;

            tail_1017 = baru_1017;
        }
        System.out.println("Lagu berhasil ditambahkan!");
    }

    public void hapusLaguAwal_1017() {
        if (head_1017 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        System.out.println("Lagu " + head_1017.getJudul_1017() + " berhasil dihapus");
        head_1017 = head_1017.next_1017;
        if (head_1017 != null) {
            head_1017.prev_1017 = null;
        } else {
            tail_1017 = null;
        }
    }

    public void tampilMaju_1017() {
        if (head_1017 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511531017 curr_1017 = head_1017;
        System.out.println("=== Playlist Maju ===");
        while (curr_1017 != null) {
            System.out.println(curr_1017.getJudul_1017() + " - " + curr_1017.getPenyanyi_1017());
            curr_1017 = curr_1017.next_1017;
        }
    }

    public void tampilMundur_1017() {
        if (tail_1017 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511531017 curr_1017 = tail_1017;
        System.out.println("=== Playlist Mundur ===");
        while (curr_1017 != null) {
            System.out.println(curr_1017.getJudul_1017() + " - " + curr_1017.getPenyanyi_1017());
            curr_1017 = curr_1017.prev_1017;
        }
    }

    public void cariLagu_1017(String judul_1017) {
        if (head_1017 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511531017 curr_1017 = head_1017;
        boolean ketemu_1017 = false;
        while (curr_1017 != null) {
            if (curr_1017.getJudul_1017().equalsIgnoreCase(judul_1017)) {
                System.out.println("Lagu ditemukan!");
                System.out.println("Judul : " + curr_1017.getJudul_1017());
                System.out.println("Penyanyi : " + curr_1017.getPenyanyi_1017());
                ketemu_1017 = true;
                break;
            }
            curr_1017 = curr_1017.next_1017;
        }
        if (!ketemu_1017) {
            System.out.println("Lagu tidak ditemukan!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Musik_2511531017 musik_1017 = new Musik_2511531017();
        int pilihan_1017;
        do {
            System.out.println("\n=== Playlist Musik NIM: 2511531017 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_1017 = input.nextInt();
            input.nextLine();
            switch (pilihan_1017) {
                case 1:
                    System.out.print("Judul Lagu: ");
                    String judul_1017 = input.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi_1017 = input.nextLine();
                    musik_1017.tambahLagu_1017(
                            judul_1017,
                            penyanyi_1017);
                    break;
                case 2:
                    musik_1017.hapusLaguAwal_1017();
                    break;
                case 3:
                    musik_1017.tampilMaju_1017();
                    break;
                case 4:
                    musik_1017.tampilMundur_1017();
                    break;
                case 5:
                    System.out.print("Masukkan judul lagu: ");
                    String cari_1017 = input.nextLine();
                    musik_1017.cariLagu_1017(cari_1017);
                    break;
                case 6:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_1017 != 6);
        input.close();
    }
}
