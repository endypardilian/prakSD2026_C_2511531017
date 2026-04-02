package pekan1_2511531017;

public class Driver_2511531017 {

    public static void main(String[] args) {

        Mobil_2511531017 data = new Mobil_2511531017();

        Mobil_2511531017 m1 = new Mobil_2511531017("Raize", 2021, 1000, 200000000, "Toyota");
        Mobil_2511531017 m2 = new Mobil_2511531017("Brio", 2022, 1200, 170000000, "Honda");
        Mobil_2511531017 m3 = new Mobil_2511531017("Terios", 2020, 1500, 240000000, "Daihatsu");

        data.tambah(m1);
        data.tambah(m2);
        data.tambah(m3);

        data.tampil();

        data.hapus(m2);

        data.tampil();
    }
}