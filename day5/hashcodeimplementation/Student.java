package hashcodeimplementation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Student {
	
	private int id;
	private String name;
	private int marks;
	private int age;
	

public Student(int id,String name,int age,int marks) {
	
	this.id=id;
	this.name=name;
	this.age=age;
	this.marks=marks;
}
public int getid() {
	
	return id;
}
public void setid()
	{
		this.id=id;
	}
	
	public String getname() 
	{
		return name;
	}
	public void setname()
	{
		this.name=name;
	}
	public int getmarks() {
		return marks;
	}
	public void setmarks()
	{
		this.marks=marks;
	}
    public int getage() {	
	return age;
    }
    public void setage() {
    	this.age=age;
    }
    
    @Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() 
	{
		return this.age;
		
	}
	
	@Override
	public boolean equals(Object e) {
		Student s = (Student)e;
		return this.hashCode()==s.hashCode()&&this.marks==s.marks&&this.id==s.id;
	}
	
    public static void main(String args[]) {
    	
    	Scanner sc =new Scanner(System.in);
    	Set<Student> studentset = new HashSet<>();
    	while(true) {
    		System.out.println("Enter the Student id ");
    		int id =sc.nextInt();
			System.out.println("Enter the Student age");
             int age = sc.nextInt();
             System.out.println("Enter the Student marks");
             int marks = sc.nextInt();
             System.out.println("Enter the Student name");
             String name = sc.next();
             studentset.add(new Student(id,name, marks, age));
             System.out.println("Do you want to enter Student Details");
             //String res = sc.next();
             if (!sc.next().equalsIgnoreCase("yes"))
                 break;
    	}
 sc.close();
    
    for(Student s :studentset ) {
    	System.out.println(s);
    }

    }
    }
