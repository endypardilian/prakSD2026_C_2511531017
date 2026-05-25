package pekan8_2511531017;

public class QuickSort_2511531017 {
	static void swap_1017 (int[] arr_1017, int i_1017, int j_1017) {
		int temp_1017 = arr_1017 [i_1017];
		arr_1017[i_1017] = arr_1017[j_1017];
		arr_1017[j_1017] = temp_1017;
	}
	static void medianOfThree(int[] arr_1017, int low_1017, int high_1017) {
		int mid_1017 = low_1017 + (high_1017 - low_1017)/2;
		
		if (arr_1017[low_1017] > arr_1017 [mid_1017]) {
			swap_1017(arr_1017, low_1017, mid_1017);
		}
		if (arr_1017 [low_1017] > arr_1017 [high_1017]) {
			swap_1017(arr_1017, low_1017, high_1017);
		}
		if (arr_1017 [mid_1017] > arr_1017 [high_1017]) {
			swap_1017(arr_1017, low_1017, high_1017);
		}
		swap_1017(arr_1017, mid_1017, high_1017);
	}
	static int partition_1017 (int[] arr_1017, int low_1017, int high_1017) {
		medianOfThree(arr_1017, low_1017, high_1017);
		
		int pivot_1017 = arr_1017[high_1017];
		int i_1017 = (low_1017 - 1);
		
		for (int j_1017 = low_1017; j_1017 <= high_1017 - 1; j_1017++) {
			if (arr_1017[j_1017]<pivot_1017) {
				i_1017++;
				swap_1017(arr_1017,i_1017,j_1017);
			}
		}
		swap_1017 (arr_1017, i_1017 +  1, high_1017);
		return (i_1017 + 1);
	}
	static void quickSort_1017(int[] arr_1017, int low_1017, int high_1017) {
		if (low_1017 < high_1017) {
			int pi_1017 = partition_1017(arr_1017, low_1017, high_1017);
			quickSort_1017(arr_1017, low_1017, pi_1017 - 1);
			quickSort_1017(arr_1017, pi_1017 + 1, high_1017);
		}
	}
	public static void printArr_1017(int [] arr_1017) {
		for (int i_1017 = 0; i_1017 < arr_1017.length; i_1017++) {
			System.out.print(arr_1017[i_1017] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr_1017 = {10,7,8,9,1,5};
		int N_1017 = arr_1017.length;
		System.out.print("Data sebelum diurutkan: ");
		printArr_1017(arr_1017);
		
		quickSort_1017(arr_1017, 0 , N_1017 - 1);
		
		System.out.print("Data Terurut quickSort: ");
		printArr_1017(arr_1017);

	}

}
