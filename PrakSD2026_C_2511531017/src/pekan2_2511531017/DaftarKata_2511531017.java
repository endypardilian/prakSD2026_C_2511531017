package pekan2_2511531017;
import java.util.*;

public class DaftarKata_2511531017 {
	private final ArrayList<String>data;
	public DaftarKata_2511531017() {
		this.data = new ArrayList<>();
	}
	
	public void tambah_2511531017(String elemen) {
		data.add(elemen);
	}
	
	public void tambahPada_2511531017(int index, String elemen) {
		data.add(index,elemen);
	}
	
	public void ubahElemen_2511531017(int index, String nilaiBaru) {
		data.set(index, nilaiBaru);
	}
	
	public String hapusElemen_2511531017(int index) {
		return data.remove(index);
	}
	
	public void iterasiCetak_2511531017() {
		for (int i = 0; i < data.size(); i++) {
			System.out.print(data.get(i)+" ");
		}
	}
	 public String get(int index) {
		 return data.get(index);
	 } 
	 
	 @Override
	 public String toString() {
		 return data.toString();
	 }
}
