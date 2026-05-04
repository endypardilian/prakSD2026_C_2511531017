package pekan5_2511531017;

public class PencarianSLL_2511531017 {
	static boolean searchKey (NodeSLL_2511531017 head_1017, int key_1017) {
		NodeSLL_2511531017 curr_1017 = head_1017;
		while (curr_1017 != null) {
			if (curr_1017.data_1017 == key_1017)
				return true;
			curr_1017 = curr_1017.next_1017;
		}
		return false;
	}
			public static void traversal (NodeSLL_2511531017 head_1017) {
				NodeSLL_2511531017 curr_1017 = head_1017;
				while (curr_1017 != null) {
					System.out.print(" " + curr_1017.data_1017);
					curr_1017 = curr_1017.next_1017;
				}
					System.out.println();
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeSLL_2511531017 head_1017 = new NodeSLL_2511531017(14);
		head_1017.next_1017 = new NodeSLL_2511531017(21);
		head_1017.next_1017.next_1017 = new NodeSLL_2511531017(13);
		head_1017.next_1017.next_1017.next_1017 = new NodeSLL_2511531017(30);
		head_1017.next_1017.next_1017.next_1017.next_1017 = new NodeSLL_2511531017(10);
		System.out.print("Penulusuran SSL: ");
		traversal(head_1017);
		int key_1017 = 30;
		System.out.print("cari data " + key_1017 + " = ");
		if (searchKey (head_1017, key_1017))
			System.out.println("ketemu");
		else
			System.out.println("tidak ada");
		}

	}

