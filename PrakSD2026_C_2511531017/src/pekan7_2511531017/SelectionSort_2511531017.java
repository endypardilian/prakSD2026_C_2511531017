package pekan7_2511531017;

public class SelectionSort_2511531017 {
	public static void selectionSort_2511531017(int[] arr_1017) {
		int n_1017 = arr_1017.length;
		for(int i_1017 = 0; i_1017 < n_1017; i_1017++) {
			int minIndex_1017 = i_1017;
			for(int j_1017 = i_1017 + 1; j_1017 < n_1017; j_1017++) {
				if(arr_1017[j_1017] < arr_1017[minIndex_1017]) {
					minIndex_1017 = j_1017;
				}
			}
			int temp_1017 = arr_1017[i_1017];
			arr_1017[i_1017] = arr_1017[minIndex_1017];
			arr_1017[minIndex_1017] = temp_1017;
		}
	} 
	public static void main(String[] args) {
		int arr_1017[] = {23, 78, 45, 8, 32, 56, 1};
		int n_1017 = arr_1017.length;
		System.out.printf("array yang belum terurut:\n");
		for(int i_1017 = 0; i_1017 < n_1017; i_1017++)
			System.out.print(arr_1017[i_1017] + " ");
		System.out.println("");
		selectionSort_2511531017(arr_1017);
		System.out.printf("array yang terurut:\n");
		for(int i_1017 =0; i_1017 < n_1017; i_1017++)
			System.out.print(arr_1017[i_1017] + " ");
		System.out.println("");
	}

}
