package pekan9_2511531017;

public class Node_2511531017 {
	int data_1017;
	Node_2511531017 left_1017;
	Node_2511531017 right_1017;
	public Node_2511531017(int data_1017) {
		this.data_1017 = data_1017;
		left_1017 = null;
		right_1017 = null;
	}
	public void setLeft_1017(Node_2511531017 node_1017) {
		if (left_1017 == null)
			left_1017 = node_1017;
	}
	public void setRight_1017 (Node_2511531017 node_1017) {
		if (right_1017 == null)
			right_1017 = node_1017;
	}
	public Node_2511531017 getLeft_1017() {
		return left_1017;
	}
	public Node_2511531017 getRight_1017() {
		return right_1017;
	}
	public int getData_1017 () {
		return data_1017;
	}
	public void setData_1017 (int data_1017) {
		this.data_1017 = data_1017;
	}
	void printPreorder_1017(Node_2511531017 node_1017) {
		if (node_1017 == null)
			return;
		System.out.print(node_1017.data_1017 + " ");
		printPreorder_1017(node_1017.left_1017);
		printPreorder_1017(node_1017.right_1017);
	}
	void printPostorder_1017(Node_2511531017 node_1017) {
		if (node_1017 == null)
			return;
		printPostorder_1017(node_1017.left_1017);
		printPostorder_1017(node_1017.right_1017);
		System.out.print(node_1017.data_1017 + " ");
	}
	void printInorder_1017(Node_2511531017 node_1017) {
		if (node_1017 == null)
			return;
		printInorder_1017(node_1017.left_1017);
		System.out.print(node_1017.data_1017 + " ");
		printInorder_1017(node_1017.right_1017);
	}
	public String print_1017() {
		return this.print_1017("",true,"");
	}
	public String print_1017(String prefix_1017, boolean isTail_1017, String sb_1017) {
		if (right_1017 != null) {
			right_1017.print_1017(prefix_1017 + (isTail_1017 ? "|  " : "   "),false,sb_1017);
		}
		System.out.println(prefix_1017 + (isTail_1017 ? "\\--" : "/--") + data_1017);
		if (left_1017 != null) {
			left_1017.print_1017(prefix_1017 + (isTail_1017 ? "   " : "|  "),true,sb_1017);
		}
		return sb_1017;
	}
}
