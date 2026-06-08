package pekan9_2511531017;

public class BtreeDriver_2511531017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTree_2511531017 tree_1017 = new BTree_2511531017();
		System.out.print("Jumlah Simpul awal pohon: ");
		System.out.println(tree_1017.countNodes_1017());
		
		Node_2511531017 root_1017 = new Node_2511531017(1);
		
		tree_1017.setRoot_1017(root_1017);
		System.out.println("Jumlah simpul jika hanya ada root");
		System.out.println(tree_1017.countNodes_1017());
		Node_2511531017 node2_1017 = new Node_2511531017(2);
		Node_2511531017 node3_1017 = new Node_2511531017(3);
		Node_2511531017 node4_1017 = new Node_2511531017(4);
		Node_2511531017 node5_1017 = new Node_2511531017(5);
		Node_2511531017 node6_1017 = new Node_2511531017(6);
		Node_2511531017 node7_1017 = new Node_2511531017(7);
		Node_2511531017 node8_1017 = new Node_2511531017(8);
		Node_2511531017 node9_1017 = new Node_2511531017(9);
		root_1017.setLeft_1017(node2_1017);
		node2_1017.setLeft_1017(node4_1017);
		node2_1017.setRight_1017(node5_1017);
		node4_1017.setRight_1017(node8_1017);
		root_1017.setRight_1017(node3_1017);
		node3_1017.setLeft_1017(node6_1017);
		node3_1017.setRight_1017(node7_1017);
		node6_1017.setLeft_1017(node9_1017);
		
		tree_1017.setCurrent(tree_1017.getRoot_1017());
		System.out.println("menampilkan simpul terakhir");
		System.out.println(tree_1017.getCurrent().getData_1017());
		System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
		System.out.println(tree_1017.countNodes_1017());
		System.out.println("InOrder: ");
		tree_1017.printInoreder_1017();
		System.out.println("\nPreOrder: ");
		tree_1017.printPreoreder_1017();
		System.out.println("\nPostOrder: ");
		tree_1017.printPostoreder_1017();
		System.out.println("\nmenampilkan simpuk dalam bentuk pohon");
		tree_1017.print_1017();
		
		
	}

}
