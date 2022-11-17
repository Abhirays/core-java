package oops;

public class testperson {
	public static void main(String[] args) {
		person p = new person();
		p.setDob(2002);
		p.setAddress("101");
		p.setName("abhishek");
		System.out.println(p.getName());
     System.out.println(p.getAddress());
     System.out.println(p.getDob());
	}	

}
