package pekan6_2511531017;

public class PenulusuranDLL_2511531017 {
	static void forwardTraversal (NodeDLL_2511531017 head_1017) {
		NodeDLL_2511531017 curr_1017 = head_1017;
		while (curr_1017 != null) {
			System.out.print(curr_1017.data_1017 + " <-> ");
			curr_1017 = curr_1017.next_1017;
		}
		System.out.println();
	}
	static void backwardTraversal (NodeDLL_2511531017 tail_1017) {
		NodeDLL_2511531017 curr_1017 = tail_1017;
		while (curr_1017 != null) {
			System.out.print(curr_1017.data_1017 + " <-> ");
			curr_1017 = curr_1017.prev_1017;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeDLL_2511531017 head_1017 = new NodeDLL_2511531017(1);
		NodeDLL_2511531017 second_1017 = new NodeDLL_2511531017(2);
		NodeDLL_2511531017 third_1017 = new NodeDLL_2511531017(3);
		
		head_1017.next_1017 = second_1017;
		second_1017.prev_1017 = head_1017;
		second_1017.next_1017 = third_1017;
		third_1017.prev_1017 = second_1017;
		
		System.out.println("Penulusuran maju:");
		forwardTraversal(head_1017);
		System.out.println("Penulusuran mundur:");
		backwardTraversal(third_1017);

	}

}
