
package cucea.poo.osmar.actividad14poo;

public class Circulo extends Figura {
    private double radio;
    public Circulo(double radio, String color){
        super (color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double Area(){
        return 3.1416*radio*radio;
    }
}
