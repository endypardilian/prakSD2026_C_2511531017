package pekan5_2511531017;

public class Pasien_2511531017 {
	String namaPasien_1017;
    String penyakit_1017;
    int nomorAntrian_1017;
    Pasien_2511531017 next_1017;

    public Pasien_2511531017(String nama, String penyakit, int nomor) {
        this.namaPasien_1017 = nama;
        this.penyakit_1017 = penyakit;
        this.nomorAntrian_1017 = nomor;
        this.next_1017 = null;
    }
    public String getNama_1017() {
        return namaPasien_1017;
    }
    public String getPenyakit_1017() {
        return penyakit_1017;
    }
    public int getNomor_1017() {
        return nomorAntrian_1017;
    }
    public Pasien_2511531017 getNext_1017() {
        return next_1017;
    }
    public void setNext_1017(Pasien_2511531017 next) {
        this.next_1017 = next;
    }
}

	
	    

