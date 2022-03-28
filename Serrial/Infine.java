package Serrial;

public class Infine {
	public static void main(String[] args) {
		try {
		int a=10/0;
		System.out.println(a);
		
	}
		catch (Exception c) {
			System.out.println("rest of code");
		}
		finally {
			System.out.println("hello world");
		}
		}

}
