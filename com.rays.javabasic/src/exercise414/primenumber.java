package exercise414;

public class primenumber {
	      public static void main(String[] args) {
	    	  int num = 66;
	    	  int count = 0;
	for (int i = 2; i < num; i++) {
		
		if (num % i ==0) {
			
			System.out.println("not prime");
			break;
		}
	}    	  
	        if (count == 0) {
	        	System.out.println("prime");
	        }

	      }
	}



