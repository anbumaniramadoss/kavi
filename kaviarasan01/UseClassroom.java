package kaviarasan01;

public class UseClassroom {
	public static void main (String [] args) {
		
		Classroom a1= new Classroom();
		a1.no=1;
		a1.name= "ELEVEN A";
		a1.desk=56;
		a1.avg=70.5f;
		a1.isgood=false;
		a1.num=8807595029l;
		
		
		Classroom a2= new Classroom();
		a2.no=2;
		a2.name= "ELEVEN B";
		a2.desk=56;
		a2.avg=60.4f;
		a2.isgood=true;
		a2.num=8508544747l;
		
		System.out.println(a1.no+", "+a1.name+" ,"+a1.desk+" , "+a1.avg+" ,"+a1.isgood+" , "+a1.num);
		System.out.println(a2.no+" ,"+a2.name+" ,"+a2.desk+" ,"+ a2.avg+" ,"+a2.isgood+" ,"+a2.num);
		
		
		
		
	}

}
