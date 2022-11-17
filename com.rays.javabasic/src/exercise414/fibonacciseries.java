package exercise414;

public class fibonacciseries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 3;
		int count = 10;
		int i;
		System.out.println(a+ ""+ b);
		for(i = 2; i < count; i++) {
			c = a+ b;
			System.out.println(""+c);
			a = b;
			b = c;
		}
	}

}
