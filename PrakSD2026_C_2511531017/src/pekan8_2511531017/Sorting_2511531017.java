package pekan8_2511531017;

public class Sorting_2511531017 {

    static Lagu_2511531017[] dataLagu_1017 = new Lagu_2511531017[20];
    static int jumlahData_1017 = 0;
    public static void inputData_1017() {
        dataLagu_1017[0] = new Lagu_2511531017("Perfect", "Ed Sheeran", 263);
        dataLagu_1017[1] = new Lagu_2511531017("Attention", "Charlie Puth", 211);
        dataLagu_1017[2] = new Lagu_2511531017("Believer", "Imagine Dragons", 204);
        dataLagu_1017[3] = new Lagu_2511531017("Shape Of You", "Ed Sheeran", 240);
        dataLagu_1017[4] = new Lagu_2511531017("Dandelions", "Ruth B", 233);
        dataLagu_1017[5] = new Lagu_2511531017("Memories", "Maroon 5", 189);
        dataLagu_1017[6] = new Lagu_2511531017("Photograph", "Ed Sheeran", 258);
        dataLagu_1017[7] = new Lagu_2511531017("Happier", "Olivia Rodrigo", 175);
        dataLagu_1017[8] = new Lagu_2511531017("Counting Stars", "OneRepublic", 257);
        dataLagu_1017[9] = new Lagu_2511531017("Stay", "The Kid Laroi", 141);
        dataLagu_1017[10] = new Lagu_2511531017("Yellow", "Coldplay", 269);
        dataLagu_1017[11] = new Lagu_2511531017("Faded", "Alan Walker", 212);
        dataLagu_1017[12] = new Lagu_2511531017("Unstoppable", "Sia", 217);
        jumlahData_1017 = 13;
    }

    public static void shellSort_1017() {
        int n_1017 = jumlahData_1017;
        int gap_1017 = n_1017 / 2;
        while (gap_1017 > 0) {
            for (int i_1017 = gap_1017; i_1017 < n_1017; i_1017++) {
                Lagu_2511531017 temp_1017 = dataLagu_1017[i_1017];
                int j_1017 = i_1017;
                while (j_1017 >= gap_1017 && dataLagu_1017[j_1017 - gap_1017].judul_1017.compareToIgnoreCase(temp_1017.judul_1017) > 0) {
                    dataLagu_1017[j_1017] = dataLagu_1017[j_1017 - gap_1017];
                    j_1017 = j_1017 - gap_1017;
                }
                dataLagu_1017[j_1017] = temp_1017;
            }
            gap_1017 = gap_1017 / 2;
        }
    }

    public static void tampilData_1017() {
        for (int i_1017 = 0; i_1017 < jumlahData_1017; i_1017++) {
            System.out.println((i_1017 + 1) + ". "+ dataLagu_1017[i_1017].judul_1017+ " | "+ dataLagu_1017[i_1017].penyanyi_1017
                    + " | "+ dataLagu_1017[i_1017].durasi_1017+ " detik");
        }
    }

    public static void main(String[] args) {
        inputData_1017();
        System.out.println("=== DATA SEBELUM SORTING ===");
        tampilData_1017();
        shellSort_1017();
        System.out.println("\n=== DATA SETELAH SHELL SORT ===");
        tampilData_1017();
    }
}