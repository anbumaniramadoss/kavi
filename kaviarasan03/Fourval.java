package kaviarasan03;

public class Fourval {
	
	public static void main (String [] args) {
		
		int [ ] a= { 45,90,56,34,20};
		
		if ((a[0]>a[1])&& (a[0]>a[2])&& (a[0]>a[3])&& (a[0]>a[4])){
			
			System.out.print(45);
		}
		
		else if ((a[1]>a[0])&& (a[1]>a[2])&& (a[1]>a[3])&& (a[1]>a[4])){
			
			System.out.print(90);
		}
		
		else if ((a[2]>a[0])&& (a[2]>a[1]) && (a[2]>a[3])&& (a[2]>a[4])){
			
			System.out.print(56);
		}
		else if ((a[3]>a[0])&& (a[3]>a[1])&& (a[3]>a[2])&& (a[3]>a[4])){
			
			System.out.print(34);
		}
		
		else {
			
			System.out.print(20);
		}
	}

}
