package kaviarasan04;

public class Uselaptops {
	public static void main (String [] args) {
		
		
		laptops lap1=new laptops();
		lap1.brand="hp";
		lap1.price=42000;
		lap1.isios=false;
		lap1.tax=28;
		lap1.netprice=lap1.price+lap1.price*lap1.tax/100;
		
		
		laptops lap2 =new laptops();
		lap2.brand="apple";
		lap2.price=80000;
		lap2.isios=true;
		lap2.tax=15;
		lap2.netprice=lap2.price*lap2.tax/100+lap2.price;
		
		laptops lap3=new laptops();
		lap3.brand="assus";
		lap3.price=45000;
		lap3.isios=true;
		lap3.tax=10;
		lap3.netprice=lap3.price+lap3.price*lap3.tax/100;
		
		laptops [] laptop= {lap1,lap2,lap3};
		
		//System.out.println(laptop[0].brand+" ,"+laptop[0].netprice+laptop[0].isios); 
		//System.out.println(laptop[1].brand+laptop[1].netprice+laptop[1].isios);
		//System.out.println(laptop[2].brand+laptop[2].netprice+laptop[2].isios);//
		
		int total=0;
		int average;
		for (int i=0;i<laptop.length;i++){
			
			//System.out.println("brand="+laptop[i].brand+","+"price="+laptop[i].price);
			
			total=laptop[i].price+total; //total in loop
			
			
		}
		
		System.out.println(total);
		
		average= total/laptop.length;// average
		System.out.println(average);
	}

}
