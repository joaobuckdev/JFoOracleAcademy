import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String args[]) {
        int currentColor;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira um valor da cor: ");
        currentColor = teclado.nextInt();

        if (currentColor == 1) {
            System.out.println("O semáforo está em amarelo.");
        } else if (currentColor == 2) {
            System.out.println("O semáforo está em verde.");
        } else if (currentColor == 3) {
            System.out.println("O semáforo está em amarelo.");
        } else {
            System.out.println("A cor inserida é inválida!");
        }
        teclado.close();
    }
}
