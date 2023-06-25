public class TestClass {
  public static void main(String args[]) {
    /* Problema 1: Escrevendo métodos */
    ComputeMethods computar = new ComputeMethods();

    double degreesF = 100;
    double degreesC = computar.fToC(degreesF);
    System.out.println("Temperatura em Celsius: " + degreesC);

    int a = 8;
    int b = 6;
    double hypotenuse = computar.hypotenuse(a, b);
    System.out.println("A hipotenusa é: " + hypotenuse);

    int somaDados = computar.rolar();
    System.out.println("A soma dos valores dos dados é de: " + somaDados);
  }
}