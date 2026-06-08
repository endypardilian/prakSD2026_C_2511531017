package pekan9_2511531017;

public class BTree_2511531017 {
	private Node_2511531017 root_1017;
	private Node_2511531017 currentNode_1017;
	public BTree_2511531017() {
		root_1017 = null;
	}
	public boolean search_1017(int data_1017) {
		return search_1017(root_1017,data_1017);
	}
	private boolean search_1017(Node_2511531017 node_1017, int data_1017) {
		if (node_1017.getData_1017()== data_1017)
			return true;
		if (node_1017.getRight_1017() != null)
			if (search_1017(node_1017.getLeft_1017(), data_1017))
				return true;
		return false;
	}
	public void printInoreder_1017() {
		root_1017.printInorder_1017(root_1017);
	}
	public void printPreoreder_1017() {
		root_1017.printPreorder_1017(root_1017);
	}
	public void printPostoreder_1017() {
		root_1017.printPostorder_1017(root_1017);
	}
	public Node_2511531017 getRoot_1017() {
		return root_1017;
	}
	public boolean isEmpty_1017() {
		return root_1017 == null;
	}
	public int countNodes_1017() {
		return countNodes_1017(root_1017);
	}
	private int countNodes_1017(Node_2511531017 node_1017) {
		int count_1017 = 1;
		if (node_1017== null) {
			return 0;
		}else {
			count_1017 += countNodes_1017(node_1017.getLeft_1017());
			count_1017 += countNodes_1017(node_1017.getRight_1017());
			return count_1017;
		}
	}
	public void print_1017() {
		root_1017.print_1017();
	}
	public Node_2511531017 getCurrent() {
		return currentNode_1017;
	}
	public void setCurrent(Node_2511531017 node_1017) {
		this.currentNode_1017 = node_1017;
	}
	public void setRoot_1017 (Node_2511531017 root_1017) {
		this.root_1017 = root_1017;
	}
}
