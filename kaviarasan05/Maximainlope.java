package kaviarasan05;

public class Maximainlope {
	public static void main (String[ ]args) {
		
		int [] nos= {1,4,5,-7,-8,-9,-10};
		
		int max=0;
		int min=0;
		
		for (int i=0;i<nos.length;i++) {
						
			if(nos[i]>max) {
				max=nos[i];
			}	
			if (nos[i]<min)	{
				min=nos[i];
				
			}
				
			
			
		}
		System.out.println(max);
		System.out.println(min);
	}
	

}
