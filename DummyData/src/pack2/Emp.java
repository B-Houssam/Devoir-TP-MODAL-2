package pack2;

public class Emp {

	public String name;
	public int age;
	public String designation;
	private double salary;
	
	public Emp() {
		// TODO Auto-generated constructor stub		
	}
	
	public Emp(String name) {
		this.name = name;
	}
	
	public void empAge(int empAge) {age = empAge;}
	public void empDesignation(String empDesig) {designation = empDesig;}
	public void empSalary(double empSalary) {salary = empSalary;}
	public void printName() {System.out.println("Name:"+ name );}

}
