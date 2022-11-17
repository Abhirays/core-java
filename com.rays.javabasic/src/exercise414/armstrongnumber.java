package exercise414;

public class armstrongnumber {
	public static void main(String[] args) {
		int num = 370, number, temp, total = 0;
		number = num;
		while (num != 0) {
			temp = number % 10;
			total = total + temp*temp*temp;
			number /= 10;
		}
		if (total == num)
			System.out.println(num + "is a armstrong number");
		else
             System.out.println(num + "is not a armstong number");	
	}
}
