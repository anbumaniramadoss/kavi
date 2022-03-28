package kaviarasan01;

public class Markers {
	public static void main (String [] args) {
		
		Marker m1=new Marker();
				m1.brand="reynolds";
		m1.price=20;
		m1.height=2.5f;
		
		Marker m2=new Marker();
				m2.brand="cello";
				m2.price=90;
		m2.height=7.5f;
				
		System.out.println(m1.brand+" "+m1.price+" "+m1.height);
		System.out.print(m2.brand+" "+m2.price+" "+m2.height);
	}
	

}
