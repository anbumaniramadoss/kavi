package kaviarasan01;

public class Usecase {

	public static void main (String [] args) {
	
		
		Case c1= new Case();
		c1.name="godrej";
		c1.isgreencolour=false;
		c1.price=44;
		c1.torque=2.2f;
		
		Case c2= new Case();
		c2.name="prestige";
		c2.isgreencolour=true;
		c2.price=96;
		c2.torque=6.3f;
		
		System.out.println(c1.name+c1.isgreencolour+c1.price+c1.torque);
		System.out.print(c2.name+c2.isgreencolour+c2.price+c2.torque);
		
		
	}
	

	
}