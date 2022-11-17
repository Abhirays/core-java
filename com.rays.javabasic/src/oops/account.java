package oops;

public class account {

private String number;
private String accountType;
private double balance;

public void setnumber(String number) {
	this.number = number;
	}
public String getnumber() {
	return number;
}
public void setaccountType( String accountType) {
	this.accountType = accountType;
}
public String getaccounttype() {
	return accountType;
}
public void setBalance (double balance) {
	this.balance = balance;
}
public double getbalance() {
	return balance;
}
public double deposite(double bal) {
	double current = bal + getbalance();
	setBalance(current);
	return current;
}




}



