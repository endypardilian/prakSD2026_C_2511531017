package pekan8_2511531017;

public class shellSort_2511531017 {
	public static void shellShort_2511531017(int[] A_1017) {
		int n_1017 = A_1017.length;
		int gap_1017 = n_1017 / 2;
		while (gap_1017 > 0) {
			for (int i_1017 = gap_1017; i_1017<n_1017; i_1017++) {
				int temp_1017 = A_1017[i_1017];
				int j_1017 = i_1017;
				while (j_1017 >= gap_1017 && A_1017[j_1017 - gap_1017] > temp_1017) {
					A_1017[j_1017]= A_1017[j_1017 - gap_1017];
					j_1017= j_1017 - gap_1017;
				}
				A_1017[j_1017] = temp_1017;
			}
			gap_1017 = gap_1017/2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data_1017 = {3,10,4,6,8,9,7,2,1,5};
		System.out.print("Sebelum: ");
		printArray_1017(data_1017);
		shellShort_2511531017(data_1017);
		System.out.print("Sesudah (Shell Sort): ");
		printArray_1017(data_1017);

	}
	public static void printArray_1017(int[] arr_1017) {
		for (int i_1017 : arr_1017) System.out.print(i_1017 + " ");
		System.out.println();
	}

}
