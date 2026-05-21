package pekan7_2511531017;

public class Mahasiswa_2511531017 {
    private String nama_1017;
    private String nim_1017;
    private String prodi_1017;

    public Mahasiswa_2511531017(String nama_1017, String nim_1017, String prodi_1017) {
        this.nama_1017 = nama_1017;
        this.nim_1017 = nim_1017;
        this.prodi_1017 = prodi_1017;
    }
    public String getNama_1017() {
        return nama_1017;
    }
    public void setNama_1017(String nama_1017) {
        this.nama_1017 = nama_1017;
    }
    public String getNim_1017() {
        return nim_1017;
    }
    public void setNim_1017(String nim_1017) {
        this.nim_1017 = nim_1017;
    }
    public String getProdi_1017() {
        return prodi_1017;
    }
    public void setProdi_1017(String prodi_1017) {
        this.prodi_1017 = prodi_1017;
    }
    public String toString() {
        return nama_1017 + " | " + nim_1017 + " | " + prodi_1017;
    }
}
