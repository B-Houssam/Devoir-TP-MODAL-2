package pack1;

public class Entreprise {
	
	public String name;
	public String adresse;

	public Entreprise() {
		// TODO Auto-generated constructor stub
	}
	
	public Entreprise(String name) {
		this.name = name;
	}
	
	public void empAdresse(String a) {adresse = a;}
	public void printName() {System.out.println("Name:"+ name );}

}
