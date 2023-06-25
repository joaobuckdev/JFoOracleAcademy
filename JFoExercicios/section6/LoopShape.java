public class LoopShape {
    public static void main(String args[]) {
        /* Problema 3: Arte ASCII Problemática/Programática */
        int altura = 5;
        int largura = 4;

        createRectangle(largura, altura);
        
        System.out.println(" ");

        int comprimentoPerna = 5;
        createTriangle(comprimentoPerna);
    }   
    public static void createRectangle(int altura, int largura) {
        if ((largura < 1) || (altura < 1)) {
            System.out.println("As dimensões do retângulo devem ser maiores que 1!");
        }
        for (int linha = 0; linha < altura; linha++) {
            for (int coluna = 0; coluna < largura; coluna++) {
                if (linha == 0 || linha == altura - 1 || coluna == 0 || coluna == largura - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } 
    public static void createTriangle(int comprimentoPerna) {
        if (comprimentoPerna < 1) {
            System.out.println("A dimensão da perna do triângulo deve ser maior que 1.");
            return;
        }
        for (int linha = 0; linha < comprimentoPerna; linha++) {
            for (int coluna = 0; coluna <= linha; coluna++) {
                if (linha == comprimentoPerna - 1 || coluna == 0 || coluna == linha) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
