package lab2.com;

public class ExceptionaLhandling {
public static void main(String[] args) {
	try {
		int result = 100/ 0;
		
	}
	catch(ArithmeticException e) {
		//system.out.println(e.printStackTrace());
		System.out.println(e.getStackTrace());
	}
}
}
