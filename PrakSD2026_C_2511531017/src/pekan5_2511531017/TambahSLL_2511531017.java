package pekan5_2511531017;

public class TambahSLL_2511531017 {
	public static NodeSLL_2511531017 insertAtFront(NodeSLL_2511531017 head_1017, int value_1017) {
		NodeSLL_2511531017 new_node_1017 = new NodeSLL_2511531017(value_1017);
		new_node_1017.next_1017 = head_1017;
		return new_node_1017;
	}
	
	public static NodeSLL_2511531017 insertAtEnd (NodeSLL_2511531017 head_1017, int value_1017) {
		NodeSLL_2511531017 newNode_1017 = new NodeSLL_2511531017 ( value_1017);
		if (head_1017 == null) {
			return newNode_1017;
		}
		
		NodeSLL_2511531017 last_1017 = head_1017;
		while (last_1017.next_1017 != null) {
			last_1017 = last_1017.next_1017;
		}
		
		last_1017.next_1017 = newNode_1017;
		return head_1017;
	}
	static NodeSLL_2511531017 GetNode_1017 (int data_1017) {
		return new NodeSLL_2511531017 (data_1017);
	}
	
	static NodeSLL_2511531017 insertPos (NodeSLL_2511531017 headNode_1017, int position_1017, int value_1017) {
		NodeSLL_2511531017 head_1017 = headNode_1017;
		if (position_1017 < 1)
			System.out.print("Invalid position");
		if (position_1017 == 1) {
			NodeSLL_2511531017 new_node_1017 = new NodeSLL_2511531017 (value_1017);
			new_node_1017.next_1017 = head_1017;
			return new_node_1017;
		}else {
			while (position_1017-- != 0) {
				if (position_1017 == 1) {
					NodeSLL_2511531017 newNode_1017 = GetNode_1017(value_1017);
					newNode_1017.next_1017 = headNode_1017.next_1017;
					newNode_1017.next_1017 = newNode_1017;
					break;
				}
				headNode_1017 = headNode_1017.next_1017;
			}
			if (position_1017 != 1) {
				System.out.print("Posisi di luar jangkauan");
			}
			return head_1017;
		}
	}
			public static void printList(NodeSLL_2511531017 head_1017) {
				NodeSLL_2511531017 curr_1017 = head_1017;
				while (curr_1017.next_1017 != null) {
					System.out.print(curr_1017.data_1017 + "-->");
					curr_1017 = curr_1017.next_1017;
				}
				if (curr_1017.next_1017 == null) {
					System.out.print(curr_1017.data_1017);
					System.out.println();
				}
			}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeSLL_2511531017 head_1017 = new NodeSLL_2511531017(2);
		head_1017.next_1017 = new NodeSLL_2511531017(3);
		head_1017.next_1017.next_1017 = new NodeSLL_2511531017(5);
		head_1017.next_1017.next_1017.next_1017 = new NodeSLL_2511531017(6);
		System.out.print("Senarai berantai awal:");
		printList(head_1017);
		System.out.print("tambah 1 simpul di depan: ");
		int data_1017 = 1;
		head_1017 = insertAtFront(head_1017,data_1017);
		printList(head_1017);
		System.out.print("tambah 1 simpul di belakang: ");
		int data2_1017 = 7;
		head_1017 = insertAtFront(head_1017,data2_1017);
		printList(head_1017);
		System.out.print("tambah 1 simpul ke data 4: ");
		int data3_1017 = 4;
		int pos_1017 = 4;
		head_1017 = insertAtFront(head_1017, pos_1017);
		printList(head_1017);
	}

}
