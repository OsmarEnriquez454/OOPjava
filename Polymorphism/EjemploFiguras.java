//Actividad 14
//Poo: Encapsulamiento
//OGEA
package cucea.poo.osmar.actividad14poo;

public class EjemploFiguras {

    void CrearFigura(Figura figura){
        System.out.println("Mi color es: " + figura.getColor() + " Mi area es: " + figura.Area());
    }
    public static void main(String[] args) {
        
        EjemploFiguras a = new EjemploFiguras();
        a.CrearFigura(new Circulo( 2.5, "rojo" ));
        a.CrearFigura(new Cuadrado(5.0, "azul"));
        a.CrearFigura(new Rectangulo(2.0,5.9,"verde"));
        a.CrearFigura(new Triangulo(6.0,3.0,"morado"));
    }
    
}
