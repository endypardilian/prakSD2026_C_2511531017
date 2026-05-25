package pekan8_2511531017;

public class MergeSort_2511531017 {
	void merge_1017(int arr_1017[], int l_1017, int m_1017, int r_1017) {
		int n1_1017 = m_1017 - l_1017 + 1;
		int n2_1017 = r_1017 - m_1017;

		int L_1017[] = new int[n1_1017];
		int R_1017[] = new int[n2_1017];

		for (int i_1017 = 0; i_1017 < n1_1017; ++i_1017)
			L_1017[i_1017] = arr_1017[l_1017 + i_1017];

		for (int j_1017 = 0; j_1017 < n2_1017; ++j_1017)
			R_1017[j_1017] = arr_1017[m_1017 + 1 + j_1017];

		int i_1017 = 0, j_1017 = 0;

		int k_1017 = l_1017;
		while (i_1017 < n1_1017 && j_1017 < n2_1017) {
			if (L_1017[i_1017] <= R_1017[j_1017]) {
				arr_1017[k_1017] = L_1017[i_1017];
				i_1017++;
			} else {
				arr_1017[k_1017] = R_1017[j_1017];
				j_1017++;
			}
			k_1017++;
		}

		while (i_1017 < n1_1017) {
			arr_1017[k_1017] = L_1017[i_1017];
			i_1017++;
			k_1017++;
		}

		while (j_1017 < n2_1017) {
			arr_1017[k_1017] = R_1017[j_1017];
			j_1017++;
			k_1017++;
		}
	}

	void sort_1017(int arr_1017[], int l_1017, int r_1017) {
		if (l_1017 < r_1017) {
			int m_1017 = (l_1017 + r_1017) / 2;

			sort_1017(arr_1017, l_1017, m_1017);
			sort_1017(arr_1017, m_1017 + 1, r_1017);

			merge_1017(arr_1017, l_1017, m_1017, r_1017);
		}
	}

	static void printArray_1017(int arr_1017[]) {
		int n_1017 = arr_1017.length;

		for (int i_1017 = 0; i_1017 < n_1017; ++i_1017)
			System.out.print(arr_1017[i_1017] + " ");

		System.out.println();
	}

	public static void main(String[] args) {

		int arr_1017[] = {12, 11, 13, 5, 6, 7};

		System.out.println("Sebelum terurut");
		printArray_1017(arr_1017);

		MergeSort_2511531017 ob_1017 = new MergeSort_2511531017();

		ob_1017.sort_1017(arr_1017, 0, arr_1017.length - 1);

		System.out.println("\nSesudah Terurut menggunakan Merge Sort");
		printArray_1017(arr_1017);
	}
}