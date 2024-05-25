// Programacion orientada a objetos
// Examen 2
// By: OGEA
package cucea.poo.osmar.examen2;

import java.util.Scanner;

class CuentaBancaria{
    private int NumCuenta;
    private int saldo;
    private int depositar;
    private String NombreTitu;
    private String Dire;
    
    CuentaBancaria(int saldo, String NombreTitu, String Dire, int NumCuenta){
        this.NombreTitu = NombreTitu;
        this.Dire = Dire;
        this.saldo = saldo;
        this.NumCuenta = NumCuenta;
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNombreTitu() {
        return NombreTitu;
    }

    public void setNombreTitu(String NombreTitu) {
        this.NombreTitu = NombreTitu;
    }

    public String getDire() {
        return Dire;
    }

    public void setDire(String Dire) {
        this.Dire = Dire;
    }
    
    public void Depositar(int depositar){
        this.depositar = depositar;
        saldo = depositar + saldo;
        System.out.println("Se han depositado " + depositar + " pesos en su cuenta");
    }
    
    public void Retirar(int depositar){
        if(depositar<=saldo){
            this.depositar = depositar;
            saldo = saldo-depositar;
            System.out.println("Se han retirado " + depositar + " pesos en su cuenta");
        }
        else{
            System.out.println("Quieres retirar mas de lo que tienes"); 
        }
    }
    
    public void Saldo(){
        System.out.println("El cliente " + getNombreTitu() + " Con numero de cuenta " + NumCuenta + " con una direccion " + Dire + " Cuenta en este momento con " + getSaldo());
        
    }
}