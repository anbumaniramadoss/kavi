package kaviarasan03;

public class aryavg {
	
	public static void main (String [] args) {
		
		int [] given= {20,40,50,60,70};
		System.out.print((given[0]+given[1]+given[2]+given[3]+given[4])/5);
		
		int [] avg= {48};
		
		if (given[4]>avg[0]) {
			
			System.out.println("is pgreater");
			
				
		}
		
		else if (given[3]>avg[0]) {
			
			System.out.println("is fvgreater");			
		}
		
		if (given [2]>avg[1]) {
			System.out.println("is greater");	
			
			
		}
		else if (given[1]>avg[1]) {
			System.out.println("is wgreater");	
			
		}
		if (given[0]>avg[1]) {
			System.out.println("is ngreater");
			
		}
		
	}
}
		
		
		


