package kaviarasan02;

public class Elseif {

	public static void main (String [] args) {
		int a=8500;
		int b=4000;
		int c=3500;
		
		if ((a>b) && (a>c)){
			
			System.out.print("print a is greater");
		}
		
		else if ((b>a)&& (b>c)) {
			
			System.out.print("print B is greater");
		}
		
		else {
			
			System.out.print( "print c is greater");
		}
	}
	
}
