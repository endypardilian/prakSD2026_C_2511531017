package pekan4_2511531017;

public class QueuearrayDriver_2511531017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray_2511531017 queue = new QueueArray_2511531017(1000);
		queue.enqueue_1017(10);
		queue.enqueue_1017(20);
		queue.enqueue_1017(30);
		queue.enqueue_1017(40);
		System.out.println("Item di depan "+ queue.front_1017());
		System.out.println("Item paling belakang "+ queue.rear_1017());
		System.out.println("tampilan queue");
		queue.display_1017();
		System.out.println();
		System.out.println(queue.dequeue_1017() + " dihapus dari queue");
		System.out.println("Item di depan: "+ queue.front_1017());
		System.out.println("Item paling belakang: "+ queue.rear_1017());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue.display_1017();

	}

}
