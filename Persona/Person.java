//general porpouse
import java.util.Scanner;
class Person{

	private String Nombre;
	private String Direccion;
	private String Date;
	private String Sexo;
	Scanner input = new Scanner(System.in);

	public void Person(String Nombre, String Direccion, String Date, String sexo){
		
	}

	public void getData(){
		String n,add,da,se;
		System.out.println("\n Name: \n");
		n = input.nextString();
		System.out.println(" Address: \n");
		add = input.nextString();
		System.out.println(" Birth Date \n");
		da = input.nextString();
		System.out.println(" Genre \n");
		se = input.nextString();
	}

}
