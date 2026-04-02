package pekan1_2511531017;
import java.util.*;

public class Mobil_2511531017 {

    private String nama;
    private int tahun;
    private int cc;
    private long harga;
    private String merk;

    private ArrayList<Mobil_2511531017> listMobil;

    public Mobil_2511531017() {
        listMobil = new ArrayList<>();
    }

    public Mobil_2511531017(String nama, int tahun, int cc, long harga, String merk) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }

    public String getNama() {
    	return nama;
    	}
    public int getTahun() {
    	return tahun; 
    	}
    public int getCc() { 
    	return cc; 
    	}
    public long getHarga() {
    	return harga; 
    	}
    public String getMerk() {
    	return merk;
    	}

    public void setNama(String nama) {
    	this.nama = nama; 
    	}
    public void setTahun(int tahun) {
    	this.tahun = tahun; 
    	}
    public void setCc(int cc) {
    	this.cc = cc; 
    	}
    public void setHarga(long harga) { 
    	this.harga = harga;
    	}
    public void setMerk(String merk) {
    	this.merk = merk;
    	}

    public void tambah(Mobil_2511531017 m) {
        listMobil.add(m);
        System.out.println("Ditambah: " + m.getNama());
    }

    public void hapus(Mobil_2511531017 m) {
        if (listMobil.remove(m)) {
            System.out.println("Dihapus: " + m.getNama());
        } else {
            System.out.println("Data ga ketemu");
        }
    }

    public void tampil() {
        System.out.println("\nData mobil:");
        for (Mobil_2511531017 m : listMobil) {
            System.out.println(m);
        }
    }
    @Override
    public String toString() {
        return nama + " | " + tahun + " | " + cc + "cc | Rp" + harga + " | " + merk;
    }
}
