package Streams;

public class Student {
private	int id;
private	String name;
private	String gender;
public int getId() {
	return id;
}

public String getName() {
	return name;
}

public String getGender() {
	return gender;
}

public Student(int id, String name, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
}


public String toString() {
	return "Student [id=" + id + ", name=" + name + ", gender=" + gender + "]";
}





}
