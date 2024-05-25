import java.util.Scanner;
class Operacion{
  int num1;
  int num2;
  int resul;
  public void numero1(){
    Scanner input = new Scanner(System.in);
    System.out.print("Introduce el numero 1: ");
    num1 = input.nextInt();
  }
  public void numero2(){
    Scanner input = new Scanner(System.in);
    System.out.print("Introduce el numero 2: ");
    num2 = input.nextInt();
  }
}