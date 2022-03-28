package kaviarasan05;

public class Lopeoddeven {
	
	public static void main (String [] args ) {
		
	
	int count=0;
	int count1=0;
		
		int [] od= {25,36,49,54,67,28};
		
		for(int i=0;i<od.length;i++){
		
				
		
		if((od[i]%2==0))
			
		{
			System.out.println("even");
		
			count++;
		}
		
		
		else  {
			
			System.out.println("odd");
			count1++;
		}
		}
		System.out.println(count);
		System.out.println(count1);
	}
}

