package pekan3_2511531017;

public class stackArrayDriver_2511531017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackArray_2511531017 s = new stackArray_2511531017();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah :" + s.peek());
		System.out.print("Element pada stack:");
		s.print();

	}

}
