package Serrial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
	String name;
	int id;
	

public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

public static void main(String[] args) {
	try {
		
		Student s= new Student ("kavi",101);
		FileOutputStream fas =new FileOutputStream("D:\\new");
		ObjectOutputStream os= new ObjectOutputStream(fas);

	os.writeObject(s);

	os.flush();

	os.close();
	System.out.println("sucess");
	

	}

	catch(Exception e) {
		System.out.println("fail"); 
		
	

	}
}

	}


