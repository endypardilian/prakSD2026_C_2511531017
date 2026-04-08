package pekan3_2511531017;
import java.util.*;
public class NilaiMaksimum_2511531017 {
	public static int max(Stack<Integer> s_1017) {
		Stack<Integer> backup_1017 = new Stack<Integer>();
		int maxValue_1017 = s_1017.pop();
		backup_1017.push(maxValue_1017);
		while (!s_1017.isEmpty()) {
			int next = s_1017.pop();
			backup_1017.push(next);
			maxValue_1017 = Math.max(maxValue_1017, next);
		}
		while (!backup_1017.isEmpty()) {
			s_1017.push(backup_1017.pop());
		}
		return maxValue_1017;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s_1017 = new Stack<Integer>();
		s_1017.push(70);
		s_1017.push(12);
		s_1017.push(20);
		System.out.println("isis stack "+s_1017);
		System.out.println("Stack Teratas " + s_1017.peek());
		System.out.println("Nilai maksimum "+max(s_1017));

	}

}
