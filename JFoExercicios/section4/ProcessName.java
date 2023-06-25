import java.util.Scanner;

public class ProcessName {
    public static void main(String args[]) {
    /* Problema 2: Processando o nome */;
    String primeiroNome;
    String ultimoNome;

    Scanner teclado = new Scanner(System.in);
    System.out.print("Insira o seu primeiro nome: ");
    primeiroNome = teclado.next();

    System.out.print("Insira o seu último nome: ");
    ultimoNome = teclado.next();
    
    char primeiraLetra = primeiroNome.charAt(0);
    System.out.println("Seu  nome é: " + ultimoNome + ", " + primeiraLetra + ".");
    teclado.close();
    }
}