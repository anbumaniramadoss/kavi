package room;

public class Automobile implements Car {
	//Automobile a=new Automobile();
	public String getcar() {
		return "samy";
		//System.out.println("samy");
	}
	
	public String getbike() {
		return "murugan";
		//System.out.println("Murugan");
	}
	public static void main(String[] args) {
		Automobile a=new Automobile();
	System.out.println(a.getbike());
	System.out.println(a.getcar());
	}

}
