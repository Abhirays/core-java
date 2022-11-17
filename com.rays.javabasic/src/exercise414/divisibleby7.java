package exercise414;

public class divisibleby7 {
	public static void main(String[] args) {
		int d = 0;
		for (int i = 100; i < 200; i++) {
			if (i % 7 == 0) {
				d = d + i;
				System.out.println(i);
			}

		}

		System.out.println("sum of all int 100 to 200=" + d);

	}

}



