package pekan6_2511531017;

public class HapusDLL_2511531017 {
	public static NodeDLL_2511531017 delHead_1017(NodeDLL_2511531017 head_1017) {
		if (head_1017 == null) {
			return null; }
		NodeDLL_2511531017 temp_1017 = head_1017;
		head_1017 = head_1017.next_1017;
		if (head_1017 != null) {
			head_1017.prev_1017 =null;}
		return head_1017;
		}
	
	public static NodeDLL_2511531017 delLast (NodeDLL_2511531017 head_1017) {
		if (head_1017 == null) {
			return null; }
		if (head_1017.next_1017 == null) {
			return null; }
		NodeDLL_2511531017 curr_1017 = head_1017;
		while (curr_1017.next_1017 != null) {
			curr_1017 = curr_1017.next_1017;
		}
		if (curr_1017.prev_1017 != null) {
			curr_1017.prev_1017.next_1017 = null;}
		return head_1017;
		}
	public static NodeDLL_2511531017 delPos_1017(NodeDLL_2511531017 head_1017, int pos_1017) {
		if (head_1017 == null) {
			return head_1017;}
		NodeDLL_2511531017 curr_1017 = head_1017;
		for (int i = 1; curr_1017 != null && i < pos_1017; ++i) {
			curr_1017 = curr_1017.next_1017;}
		if (curr_1017 == null) {
			return head_1017;}
		if (curr_1017.prev_1017 != null) {
			curr_1017.prev_1017.next_1017 = curr_1017.next_1017;}
		if (curr_1017.next_1017 != null) {
			curr_1017.next_1017.prev_1017 = curr_1017.prev_1017;}
		if (head_1017 == curr_1017) {
			head_1017 = curr_1017.next_1017;}
		return head_1017;
		}
	public static void printList (NodeDLL_2511531017 head_1017) {
		NodeDLL_2511531017 curr_1017 = head_1017;
		while (curr_1017 != null) {
			System.out.print(curr_1017.data_1017 + " ");
			curr_1017 = curr_1017.next_1017;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeDLL_2511531017 head_1017 = new NodeDLL_2511531017(1);
		head_1017.next_1017 = new NodeDLL_2511531017(2);
		head_1017.next_1017.prev_1017 = head_1017;
		head_1017.next_1017.next_1017 = new NodeDLL_2511531017(3);
		head_1017.next_1017.next_1017.prev_1017 = head_1017.next_1017;
		head_1017.next_1017.next_1017.next_1017 = new NodeDLL_2511531017(4);
		head_1017.next_1017.next_1017.next_1017.prev_1017 =head_1017.next_1017.next_1017;
		head_1017.next_1017.next_1017.next_1017.next_1017 = new NodeDLL_2511531017(5);
		head_1017.next_1017.next_1017.next_1017.next_1017.prev_1017 =head_1017.next_1017.next_1017.next_1017;
		
		System.out.print("DLL Awal: ");
		printList(head_1017);
		System.out.print("Setelah head dihapus: ");
		head_1017 = delHead_1017(head_1017);
		printList(head_1017);
		System.out.print(" Setelah node terakhir dihapus: ");
		head_1017 = delHead_1017(head_1017);
		printList(head_1017);
		System.out.print("menghapus node terakhir dihapus: ");
		head_1017 = delHead_1017(head_1017);
		head_1017 = delPos_1017(head_1017, 2);
		
		printList(head_1017);
		

	}

}
