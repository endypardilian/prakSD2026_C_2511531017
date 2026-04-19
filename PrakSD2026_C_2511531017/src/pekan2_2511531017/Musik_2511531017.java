package pekan2_2511531017;

public class Musik_2511531017 {
    String judul;
    String penyanyi;
   int durasi;
    Musik_2511531017(String judul, String penyanyi, int durasi) {
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.durasi = durasi;
    }

    @Override
    public String toString() {
        return "Judul: " + judul + ", Penyanyi: " + penyanyi + ", Durasi: " + durasi + " detik";
    }
}