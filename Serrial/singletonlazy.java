package Serrial;

public class singletonlazy {
	private static singletonlazy a=null;
	private singletonlazy () {
		
	}
	public static singletonlazy getInstance() {
		if (a==null)
	 
			a=new singletonlazy(); 
			return a;
		
	}
	
	
	

}
