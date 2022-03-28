package kaviarasan01;

public class Usehostel {

	public static void main (String [] args) {
		
		hostel r1= new hostel();
		
		r1.name="Moon light";
		r1.roomno=12;
		r1.price=400.50f;
		r1.isaircondition=true;
		
		hostel r2=new hostel();
		
		r2.name="turgaya";
		r2.roomno=157;
		r2.price=340.20f;
		r2.isaircondition=false;
		
		hostel [] room = {r1,r2};
		
		System.out.println("name"+" -"+room[0].name+" "+room[0].roomno+""+room[0].price+" "+room[0].isaircondition);
		System.out.print(room[1].name+" "+room[1].roomno+""+room[1].price+" "+room[1].isaircondition);
		
		
		
		
	}
}
