package pekan2_2511531017;

public class DaftarKataDriver_2511531017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaftarKata_2511531017 al=new DaftarKata_2511531017();
		
		al.tambah_2511531017("Kami");
		al.tambah_2511531017("Informatika");
		
		al.tambahPada_2511531017(1, "Mahasiswa");
		
		System.out.println("Awal          : "+al);
		
		al.ubahElemen_2511531017(1, "Department");
		System.out.println("Setelah Ubah  : "+al);
		
		String terhapus = al.hapusElemen_2511531017(0);
		System.out.println("Terhapus      : "+terhapus);
		System.out.println("Setelah Hapus : "+al);
		
		System.out.print("Iterasi       : ");
		al.iterasiCetak_2511531017();
		System.out.println();

	}

}
