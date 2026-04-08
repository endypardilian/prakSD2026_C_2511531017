package pekan3_2511531017;

public class stackArray_2511531017 {
	static final int MAX = 1000;
	int top_1017;
	int a[] = new int[MAX];
	boolean isEmpty()
	{
		return (top_1017 < 0);
	}
	stackArray_2511531017(){
		top_1017 = -1;
	}
	boolean push (int x)
	{
		if (top_1017>= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++top_1017]= x;
			System.out.println(x + " dimasukan dalam stack");
			return true;
		}
			
			
	}
	int pop() {
		if (top_1017 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a [top_1017--];
			return x;
		}
	}
	int peek ()
	{
		if (top_1017 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top_1017];
			return x;
		}
	}
	void print () {
		for (int i = top_1017; i>-1;i--) {
			System.out.print(" " + a[i]);
		}
	}
}
