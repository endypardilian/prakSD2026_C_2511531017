package pekan7_2511531017;

public class InsertionSort_2511531017 {
	public static void insertionSort_2511531017(int[] arr_1017) {
		int n_1017 = arr_1017.length;
		for(int i_1017 = 1; i_1017 < n_1017; i_1017++) {
			int key_1017 = arr_1017[i_1017];
			int j_1017 = i_1017 - 1;
			while(j_1017 >= 0 && arr_1017[j_1017] > key_1017) {
				arr_1017[j_1017 + 1] = arr_1017[j_1017];
				j_1017--;
			}
			arr_1017[j_1017 + 1] = key_1017;
		}
	}
	public static void main(String[] args) {
		int arr_1017[] = {23, 78, 45, 8, 32, 56, 1};
		int n_1017 = arr_1017.length;
		System.out.printf("array yang belum terurut:\n");
		for(int i_1017 = 0; i_1017 < n_1017; i_1017++)
			System.out.print(arr_1017[i_1017] + " ");
		System.out.println("");
		insertionSort_2511531017(arr_1017);
		System.out.printf("array yang terurut:\n");
		for(int i_1017 =0; i_1017 < n_1017; i_1017++)
			System.out.print(arr_1017[i_1017] + " ");
		System.out.println("");
	}
}

