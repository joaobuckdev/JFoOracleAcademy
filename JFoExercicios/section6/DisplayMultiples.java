import java.util.Scanner;

public class DisplayMultiples {
    public static void main(String args[]) {
        /* Exibindo Múltiplos de um Número */
        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o número que deseja ver a tabuada: ");
        numero = teclado.nextInt();
        
        for (int i = 1; i <= 12; i++) {
            int resultado = numero*i;
            System.out.println(numero + "x" + i + " = " + resultado);
        }
        teclado.close();
    }
}
