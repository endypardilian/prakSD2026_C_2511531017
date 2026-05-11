package pekan6_2511531017;

public class InsertDLL_2511531017 {
	static NodeDLL_2511531017 insertBegin(NodeDLL_2511531017 head_1017, int data_1017) {
		NodeDLL_2511531017 new_node_1017 = new NodeDLL_2511531017(data_1017);
		new_node_1017.next_1017 = head_1017;
		if  (head_1017 != null) {
			head_1017.prev_1017 = new_node_1017;
		}
		return new_node_1017;
	}
	public static NodeDLL_2511531017 insertEnd (NodeDLL_2511531017 head_1017, int newData_1017) {
		NodeDLL_2511531017 newNode_1017 = new NodeDLL_2511531017(newData_1017);
		if (head_1017 == null) {
			head_1017 = newNode_1017;
		}else {
			NodeDLL_2511531017 curr_1017 = head_1017;
			while (curr_1017.next_1017 != null) {
				curr_1017 = curr_1017.next_1017;
			}
			curr_1017.next_1017 = newNode_1017;
			newNode_1017.prev_1017 = curr_1017;
		}
		return head_1017;
	}
	public static NodeDLL_2511531017 insertAtPosition (NodeDLL_2511531017 head_1017, int pos_1017, int new_data_1017) {
		NodeDLL_2511531017 new_node_1017 = new NodeDLL_2511531017(new_data_1017);
		if (pos_1017 == 1) {
			new_node_1017.next_1017 = head_1017;
			if (head_1017 != null) {
				head_1017.prev_1017 = new_node_1017;}
			head_1017 = new_node_1017;
			return head_1017;}
		NodeDLL_2511531017 curr_1017 = head_1017;
	for (int i = 1; i< pos_1017 - 1 && curr_1017 != null; ++i) {
			curr_1017 = curr_1017.next_1017;}
		if(curr_1017 == null) {
			System.out.println("Posisi tidak ada");
			return head_1017;}
		new_node_1017.prev_1017	= curr_1017;
		new_node_1017.next_1017 = curr_1017.next_1017;
		curr_1017.next_1017 = new_node_1017;
		if (new_node_1017.next_1017 != null) {
			new_node_1017.next_1017.prev_1017 = new_node_1017;}
		return head_1017;
		}
	
	public static void printList (NodeDLL_2511531017 head_1017) {
		NodeDLL_2511531017 curr_1017 = head_1017;
		while (curr_1017 != null) {
			System.out.print(curr_1017.data_1017 + " <-> ");
			curr_1017 = curr_1017.next_1017;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeDLL_2511531017 head_1017 = new NodeDLL_2511531017(2);
		head_1017.next_1017 = new NodeDLL_2511531017 (3);
		head_1017.next_1017.prev_1017 = head_1017;
		head_1017.next_1017.next_1017 = new NodeDLL_2511531017(5);
		head_1017.next_1017.next_1017.prev_1017 = head_1017.next_1017;
		System.out.print("DLL awal: ");
		printList (head_1017);
		head_1017 = insertBegin (head_1017, 1);
		System.out.print("simpul 1 ditambah di awal: ");
		printList(head_1017);
		System.out.print("simpul 6 ditambah di akhir: ");
		int data_1017 = 6;
		head_1017 = insertEnd( head_1017, data_1017);
		printList(head_1017);
		System.out.print("tambah node 4 di posisi 4:");
		int data2_1017 = 4;
		int pos_1017 = 4;
		head_1017 = insertAtPosition(head_1017, pos_1017, data2_1017);
		printList(head_1017);

	}

}
