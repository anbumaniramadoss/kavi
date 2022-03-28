package kaviarasan01;

public class Userase {

	public static void main (String [] args) {
		
		Rase r1= new Rase();
		
		r1.name="kavi";
		r1.age=14;
		r1.height=3.5f;
		r1.marks=23456.98d;
		r1.passed=false;
		
		Rase r2=new Rase();
		
		r2.name="ravi";
		r2.age=12;
		r2.height=3.3f;
		r2.marks=654321.98d;
		r2.passed=true;
		
		System.out.println(r1.name+r1.age+r1.height+r1.marks+r1.passed);
		System.out.print(r2.name+r2.age+r2.height+r2.marks+r2.passed);
		
		
		
	}
}
