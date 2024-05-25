// Programacion orientada a objetos
// Examen 2
// By: OGEA
package cucea.poo.osmar.examen2;

public class Operaciones{

    public static void main(String[] args) {
        CuentaBancaria a = new CuentaBancaria(1000, "Pepe", "Lomas Turbas", 451);
        a.Saldo();
        a.Depositar(2500);
        a.Saldo();
        a.Retirar(4000);
        a.Saldo();
        a.Depositar(500);
        a.Saldo();
        a.Retirar(4000);
        a.Saldo();
    }
}
