// Programacion orientada a objetos
// Actividad11: Introducción a las CLASES / Constructor
// By: OGEA
import java.util.Scanner;

public class Main {
  String nombre;
  int edad;
  public Main(String nombre, int edad){
      this.nombre = nombre;
      this.edad = edad;
  }
  public void datos(){
    System.out.println("Tu nombre es:" + nombre + " Y tu edad es : " + edad);
  }
  public void mayorEdad(){
    if(edad >= 18){
      System.out.println("Eres mayor de edad");

    }
    else{
      System.out.println("Eres menor de edad");
    }
  }

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Introduce tu nombre: ");
    String Nombre = input.nextLine();
    System.out.print("Introduce tu nombre: ");
    int Edad = input.nextInt();

    Main people01 = new Main(Nombre,Edad);
    people01.datos();
    people01.mayorEdad();


  
  }
}