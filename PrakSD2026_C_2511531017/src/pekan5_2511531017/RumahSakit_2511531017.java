package pekan5_2511531017;
import java.util.*;
public class RumahSakit_2511531017 {
    Pasien_2511531017 head_1017;
    int counter_1017 = 0;

    public void daftarPasien_1017(String nama, String penyakit) {
        counter_1017++;
        Pasien_2511531017 baru = new Pasien_2511531017(nama, penyakit, counter_1017);

        if (head_1017 == null) {
            head_1017 = baru;
        } else {
            Pasien_2511531017 temp = head_1017;
            while (temp.getNext_1017() != null) {
                temp = temp.getNext_1017();
            }
            temp.setNext_1017(baru);
        }
        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_1017);
    }

    public void panggilPasien_1017() {
        if (head_1017 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Memanggil Pasien:");
        System.out.println("Nama     : " + head_1017.getNama_1017());
        System.out.println("Keluhan  : " + head_1017.getPenyakit_1017());
        System.out.println("No Antri : " + head_1017.getNomor_1017());
        head_1017 = head_1017.getNext_1017();
    }

    public void tampilkanAntrian_1017() {
        if (head_1017 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        Pasien_2511531017 temp = head_1017;
        while (temp != null) {
            System.out.println(temp.getNomor_1017() + ". Nama: " + temp.getNama_1017() + ". |Keluhan: " + temp.getPenyakit_1017());
            temp = temp.getNext_1017();
        }
    }

    public void cariPasien_1017(String nama) {
        Pasien_2511531017 temp = head_1017;
        boolean ketemu = false;

        while (temp != null) {
            if (temp.getNama_1017().equalsIgnoreCase(nama)) {
                System.out.println("Pasien ditemukan:");
                System.out.println(temp.getNomor_1017() + ". Nama: " + temp.getNama_1017() + ". |Keluhan: " + temp.getPenyakit_1017());
                ketemu = true;
                break;
            }
            temp = temp.getNext_1017();
        }
        if (!ketemu) {
            System.out.println("Pasien tidak ditemukan!");
        }
    }

    public void statusAntrian_1017() {
        if (head_1017 == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        int jumlah = 0;
        Pasien_2511531017 temp = head_1017;

        while (temp != null) {
            jumlah++;
            temp = temp.getNext_1017();
        }
        System.out.println("Jumlah Pasien: " + jumlah);
        System.out.println("Pasien terdepan:");
        System.out.println("Nama: " + head_1017.getNama_1017());
        System.out.println("Keluhan: " + head_1017.getPenyakit_1017());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RumahSakit_2511531017 rs = new RumahSakit_2511531017();
        int pilihan;
        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511531017 ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Saerch)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Keluhan: ");
                    String keluhan = input.nextLine();
                    rs.daftarPasien_1017(nama, keluhan);
                    break;
                case 2:
                    rs.panggilPasien_1017();
                    break;
                case 3:
                    rs.tampilkanAntrian_1017();
                    break;
                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = input.nextLine();
                    rs.cariPasien_1017(cari);
                    break;
                case 5:
                    rs.statusAntrian_1017();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);
        input.close();
    }
}