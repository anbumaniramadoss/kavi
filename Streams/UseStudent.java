package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class UseStudent {
	private static String gender;

	public static void main(String[] args) {
		Student s1=new Student(01,"kavi","male");
		Student s2=new Student(02,"ravi","male");
		Student s3=new Student(03,"varshni","female");
		
		ArrayList<Student> sk=new ArrayList<>();
		
		sk.add(s1);
		sk.add(s2);
		sk.add(s3);
		for (int i=0;i<sk.size();i++)
		
		//List<Student>skmale=(List<Student>) sk.stream().filter(b->b.getGender().equalsIgnoreCase("male")).collect(Collectors.toList());
		//Long b1= sk.stream().filter(b->b.getGender().equalsIgnoreCase("female")).count();
		//List<String> gn=sk.stream().map(b->b.getName()).collect(Collectors.toList());
		
		System.out.println(sk.get(i));
		
	}


	}


