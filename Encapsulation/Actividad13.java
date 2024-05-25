// Programacion orientada a objetos
// Actividad13: Encpasulamiento
// By: OGEA

import java.util.Scanner;

class Persona{

    private String nombre;
    private int edad;
    private String direccion;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }
  
    public void setEdad(int edad){
        if(edad >=1 && edad <=120){
            this.edad = edad;
        }
        else{
            System.out.println("No es valida");
            System.exit(0);
        }
    }

    public String getDireccion(){
      return direccion;
    }

    public void setDireccion(String direccion){
      this.direccion = direccion;
    }
}

public class Actividad13 {
    public static void main(String[] args) {    

        String Nombre, Dire;
        int Edad;
      
        Persona ana = new Persona();
      
        Scanner input = new Scanner(System.in);

        Scanner cin = new Scanner(System.in);
      
        System.out.print("Introduce tu nombre: ");
        Nombre = input.nextLine();
        ana.setNombre(Nombre);
      
        System.out.print("Introduce tu edad: ");
        Edad = input.nextInt();
        ana.setEdad(Edad);

        System.out.print("Introduce tu Direccion: ");
        Dire = cin.nextLine();
        ana.setDireccion(Dire);

        System.out.println("Me llamo " + ana.getNombre());
        System.out.println("Mi edad es " + ana.getEdad());
        System.out.println("Mi direccion es " + ana.getDireccion());

        Persona lalo = new Persona();

        System.out.print("Introduce tu nombre: ");
        Nombre = cin.nextLine();
        lalo.setNombre(Nombre);

        System.out.print("Introduce tu edad: ");
        Edad = input.nextInt();
        lalo.setEdad(Edad);

        System.out.print("Introduce tu Direccion: ");
        Dire = cin.nextLine();
        lalo.setDireccion(Dire);

        System.out.println("Me llamo " + lalo.getNombre());
        System.out.println("Mi edad es " + lalo.getEdad());
        System.out.println("Mi direccion es " + lalo.getDireccion());
      
    }
}