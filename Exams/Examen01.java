// Programacion orientada a objetos
// Examen01: Parcial01
// By: OGEA
import java.util.Scanner;
public class Examen01{
	public static void main(String[] args){

	
	Scanner input = new Scanner(System.in);
	
	
	int size;
	
	String nom;

	

	do{
		System.out.print(" Introduce caracteres de 2 a 20 maximo : ");
		nom = input.nextLine();
		size = nom.length();
		
		if(size>=2 && size<=20){
			
			for(int i = size-1; i>=0; i--){
				System.out.print(nom.charAt(i));

			}
			
			
			System.out.println(" " + size);
			
		}

	

	}while(size>=2 && size<=20);

	System.out.println("Solo funciona con cadenas de entre 2 y 20 caracteres!!!!!");


	}
}