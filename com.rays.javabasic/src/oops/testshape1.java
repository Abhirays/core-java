package oops;

public class testshape1 { 
	public static void main(String[] args) {
		rectangle r = new rectangle();
		r.setLenght(10);
		r.setWidht(20);
		System.out.println(r.getLenght()+" "+ r.getWidht() );
		shape2 s = new shape2();
		s.setBorderwidht(12);
		s.setColor("balck");
		System.out.println(s.getBorderwidht()+ " " + s.getColor());
	}

}
