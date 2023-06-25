import java.util.Scanner;

public class JFoSection6 {
  public static void main(String args[]) {
    /* Problema 1: Validando um PIN Bancário */
    int PIN_valido = 123456;
    int PIN_entrada = 0;
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("Insira o PIN: ");
    PIN_entrada = teclado.nextInt();

    while (PIN_entrada != PIN_valido) {
      System.out.println("\nO PIN inserido é inválido. Tente novamente!");
      System.out.print("Insira o PIN: ");
      PIN_entrada = teclado.nextInt();
    }
    teclado.close();
    System.out.println("PIN validado com sucesso! Seja bem-vindo de volta.");

  }
}