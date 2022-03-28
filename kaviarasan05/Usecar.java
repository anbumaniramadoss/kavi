package kaviarasan05;

public class Usecar {
	public static void main(String [] args) {
		
		
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		
		c1.brand="bmw";
		c1.price=100000;
		
		c2.brand="mahindhra";
		c2.price=2500000;
		
		c3.brand="suzuki";
		c3.price=300000;
		
		Car [] data= {c1,c2,c3,};
		
		int total=0;
		int avg=0;
    for (int i=0;i<data.length;i++) {
	//System.out.println ("brand="+data[i].brand+"price="+data[i].price);
	total=data[i].price+total;
	
    }
    System.out.println(total);
	
	avg=total/data.length;
		
	  System.out.println(avg);

		
}
	
	
}

