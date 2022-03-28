package kaviarasan01;

public class Usemarker {
	public static void main (String [] args) {
		Marker m1= new Marker();
			    m1.brand="renolds";
				m1.price=20;
				m1.isbluecolour=true;
				
		Marker m2= new Marker();
				m2.brand="cello";
		        m2.price=32;
		        m2.isbluecolour=false;
		        
		        System.out.println(m1.brand+" "+m1.price+" " +m1.isbluecolour);
		        System.out.print(m2.brand+" " +m2.price+ " + "+m2.isbluecolour);
		        
	}

}
