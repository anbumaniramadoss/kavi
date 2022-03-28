package kaviarasan01;

public class Useseries {
	public static void main (String [] args) {
	
	Series s1= new Series();
	s1.name="ford";
	s1.isredcolour=false;
	s1.price=2343;
	s1.torque=2.3f;
	
	Series s2= new Series();
	s2.name="tata";
	s2.isredcolour=true;
	s2.price=2583;
	s2.torque=5.3f;
	
	System.out.println(s1.name+s1.isredcolour+s1.price+s1.torque);
	System.out.print(s2.name+s2.isredcolour+s2.price+s2.torque);
	
	
	}
	
	
	

}
