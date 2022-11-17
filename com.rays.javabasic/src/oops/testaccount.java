package oops;

public class testaccount {

public static void main(String[]args) {
	account a = new account();
	a.setBalance(2000);
	System.out.println("balance before deposite......"+a.getbalance());
	a.deposite(5000);
	System.out.println("balance after deposite....."+a.getbalance());
}


}
