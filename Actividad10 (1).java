// Programacion orientada a objetos
// Actividad10: Factorial
// By: OGEA
import java.util.Scanner;
public class Actividad10{
	public static void main(String[] args){
	

	Scanner input = new Scanner(System.in);
	
    	
    	char opc;
    
       	do{
         	System.out.print("Introduce numero ");
		int num = input.nextInt();
		int fact = num;
          	for(int i = 1; i < num ; i++){

            	 	fact = fact * i;



           	}

         	System.out.println("El factorial del numero:" + fact); 
         	System.out.print("Deseas intentar nuevamente? (S/N)");	
       		opc = input.next().charAt(0);
  
         }while(opc == 's' || opc == 'S');

	}
}