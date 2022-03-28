package kaviarasan05;

public class Loovowwel {
	public static void main (String [] args) {
		int count=0;
		int count1=0;
		
		int [] dam= {'e','f','a','o','g'};
		
		for (int i=0;i<dam.length;i++) {
			
			if ((dam[i]=='a')||(dam[i]=='e')||(dam[i]=='i')||(dam[i]=='o')||(dam[i]=='u')){
				
				count++;
				System.out.println("is vowels");
				
								
			}
			
			
			else	{
				
				System.out.println("not vowels");
				count1++;
				
			}
		
		}
		System.out.println(count);
		System.out.println(count1);
	}

}
