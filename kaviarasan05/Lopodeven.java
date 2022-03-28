package kaviarasan05;

public class Lopodeven {
	public static void main (String [] args) {
		
		int [] ad= {25,36,49,54,67,25};
	int count=0;
	int count1=0;	
		
		for (int i=0;i<ad.length;i++) {
			
			if (ad[i]%2==0) {
				count++;
				
				System.out.println("even");
			}
			
			else {
				
				System.out.println("odd");
				count1++;
						}
			
		}
		System.out.println("even="+count+"odd="+count1);
		
	}

}
