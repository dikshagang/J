package New;

public class Demo1 {
	public static void main(String[] args) {
	System.out.println("Start");
	try{
		System.out.println(10/0);
		System.out.println("**********");
		
	}
	catch(ArithmeticException ae){
		System.out.println("0");
		System.out.println(ae.toString());
		System.out.println(ae.getMessage());
	}
	System.out.println("Stop");
	}

}
