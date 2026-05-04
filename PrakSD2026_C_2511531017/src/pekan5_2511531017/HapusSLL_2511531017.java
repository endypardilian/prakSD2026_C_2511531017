package pekan5_2511531017;

public class HapusSLL_2511531017 {
	public static NodeSLL_2511531017 deleteHead(NodeSLL_2511531017 head_1017) {
		if (head_1017 == null)
			return null;
		head_1017 = head_1017.next_1017;
		return head_1017;
	}
	
	public static NodeSLL_2511531017 removeLastNode (NodeSLL_2511531017 head_1017) {
		if (head_1017 == null) {
			return null;
		}
		if (head_1017.next_1017 == null) {
			return null;
		}
		NodeSLL_2511531017 secondLast_1017 = head_1017;
		while (secondLast_1017.next_1017.next_1017 != null) {
			secondLast_1017 = secondLast_1017.next_1017;
		}
		secondLast_1017.next_1017 = null;
		return head_1017;
	}
	
	public static NodeSLL_2511531017 deleteNode (NodeSLL_2511531017 head_1017, int position_1017) {
		NodeSLL_2511531017 temp_1017 = head_1017;
		NodeSLL_2511531017 prev_1017 = null;
		if (temp_1017 == null)
			return head_1017;
		if (position_1017 == 1) {
			head_1017 = temp_1017.next_1017;
			return head_1017;
		}
		 for (int i = 1; temp_1017 != null && i< position_1017; i++) {
			 prev_1017 = temp_1017;
			 temp_1017 = temp_1017.next_1017;
		 }
		 if (temp_1017 != null) {
			 prev_1017.next_1017 = temp_1017.next_1017;
		 }else {
			 System.out.println("Data tidak ada");
			 return head_1017;
		 }
		 return prev_1017;
	}	 
		 public static void printList (NodeSLL_2511531017 head_1017) {
			 NodeSLL_2511531017 curr_1017 = head_1017;
			 while (curr_1017.next_1017 != null) {
				 System.out.print(curr_1017.data_1017+"-->");
				 curr_1017 = curr_1017.next_1017;
			 }
			 if (curr_1017.next_1017 == null) {
				 System.out.print(curr_1017.data_1017);
				 System.out.println();
			 }
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeSLL_2511531017 head_1017 = new NodeSLL_2511531017(1);
		head_1017.next_1017 = new NodeSLL_2511531017(2);
		head_1017.next_1017.next_1017 = new NodeSLL_2511531017(3);
		head_1017.next_1017.next_1017.next_1017 = new NodeSLL_2511531017(4);
		head_1017.next_1017.next_1017.next_1017.next_1017 = new NodeSLL_2511531017(5);
		head_1017.next_1017.next_1017.next_1017.next_1017.next_1017 = new NodeSLL_2511531017(6);
		System.out.println("list awal: ");
		printList(head_1017);
		head_1017 = deleteHead(head_1017);
		System.out.println("List setelah head dihapus: ");
		printList(head_1017);
		head_1017 = removeLastNode(head_1017);
		System.out.println("List setelah simpul terakhir dihapus: ");
		printList(head_1017);
		int position_1017 = 2;
		head_1017 = deleteNode(head_1017, position_1017);
		System.out.println("List setelah posisi 2 dihapus: ");
		printList(head_1017);

	}

}
