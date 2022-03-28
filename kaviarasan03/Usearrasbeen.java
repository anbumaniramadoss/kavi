package kaviarasan03;

public class Usearrasbeen {
	public static void main (String [] args) {
		
		student s1= new student();
		
		s1.name="kavi";
		s1.age=14;
		s1.height=3.5f;
		
		student s2= new student ();
		
		s2.name="ravi";
		s2.age=15;
		s2.height=4.5f;
		
		student s3=new student ();

		s3.name="raj";
		s3.age=14;
		s3.height=3.8f;
		
		student [] child= {s1,s2,s3};
		
		System.out.println(child[0].name+ child[0].age+child[0].height);
		System.out.println(child[1].name+child[1].age+child[1].height);
		System.out.println(child[2].name+child[2].age+child[2].height);
		System.out.println(child.length);
		
		
		
		student [] c= {s1,s2,s3};
		
		if ((c[0].age>c[1].age) && (c[0].age>c[2].age)) {
		
		System.out.println("kavi is elder");
		}
		
		else if ((c[1].age>c[2].age) &&(c[1].age>c[0].age)){
			
			System.out.println("ravi is elder");
		}
		
		else {
		System.out.println ("raj is elder");
		}
		
		
		
		
		
		
				
		
		
		
	}

}
