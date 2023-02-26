package in.coreJava.Constructors;

public class Employee1 {
	
	
	int id;
	String name;
	
	public Employee1(int id,String name) {
		
		this.id=id;
		this.name=name;
		
		System.out.println(this.id+" "+this.name);
	}
	
	public Employee1(String name) {
		this.name=name;
		System.out.println(this.name+" "+this.id);
	}
	
	public static void main(String[] args) {
		
		Employee1 emp1=new Employee1(101,"venkat");
		Employee1 emp2=new Employee1("challa");
	}
	

}
