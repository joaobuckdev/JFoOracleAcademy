import java.util.Scanner;

public class ColorRange {
  public static void main(String args[]) {
    /*  Determinando a cor no espectro visível */
    double comprimentoOnda;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Insira o comprimento da onda: ");
    comprimentoOnda = teclado.nextDouble();

    if (comprimentoOnda >= 380 && comprimentoOnda < 450) {
      System.out.println("A cor é violeta.");
    } else if (comprimentoOnda >= 450 && comprimentoOnda < 495) {
      System.out.println("A cor é azul.");
    } else if (comprimentoOnda >= 495 && comprimentoOnda < 570) {
      System.out.println("A cor é verde.");
    } else if (comprimentoOnda >= 570 && comprimentoOnda < 590) {
      System.out.println("A cor é amarelo.");
    } else if (comprimentoOnda >= 590 && comprimentoOnda < 620) {
      System.out.println("A cor é laranja.");
    } else if (comprimentoOnda >= 620 && comprimentoOnda < 750) {
      System.out.println("A cor é vermelho.");
    } else {
      System.out.println("O valor da entrada inserido não foi encontrado no espectro visível.");
      teclado.close();
    }
  }
}