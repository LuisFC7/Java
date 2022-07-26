import java.util.Scanner;

class Datos{
	
	Scanner input=new Scanner(System.in);

	public void Equation1(){
		//Arrays para datos de ecuaciones.
		double [] equation1=new double[3];
		double [] equation2=new double[3];
		int band=0;
		//Instanciacion de objeto clase Equations
		Equations in = new Equations();

		System.out.println("Ingrese la ecuación 1: ");
		for(int i=0; i<3; i++){
			equation1[i]=input.nextInt();
			band++;
			if(band==3){
				System.out.println("Ingrese la ecuación 2: ");
				for(int j=0; j<3; j++){
					equation2[j]=input.nextInt();
				}

			}
	
		}
		
		in.Identificador(equation1,equation2);
	}


}
