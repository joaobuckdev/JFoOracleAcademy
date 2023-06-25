import java.util.Random;
import java.util.Scanner;

public class JFoSection8 {
    public static void main(String args[]) {
        /* Seção 8: A Liga de Futebol */

        LigaFutebol liga = new LigaFutebol();

        liga.adicionarEquipe(new Equipe("Barcelona"));
        liga.adicionarEquipe(new Equipe("Real Madrid"));

        Scanner teclado = new Scanner(System.in);
        int semanasCongelantes = 0;

        while (semanasCongelantes < 3) {
            System.out.print("Insira a temperatura: ");
            int temperatura = teclado.nextInt();

            if (temperatura < 0) {
                System.out.println("Muito frio para jogar.\n");
                semanasCongelantes++;
            } else {
                semanasCongelantes = 0;
                if (temperatura >= 15) {
                    Equipe equipe1 = gerarEquipeAleatoria(liga);
                    Equipe equipe2 = gerarEquipeAleatoria(liga);
                    while (equipe1 == equipe2) {
                        equipe1 = gerarEquipeAleatoria(liga);
                    }
                    Jogo jogo1 = new Jogo(liga.getJogos().size() + 1, temperatura, equipe1, equipe2);
                    Jogo jogo2 = new Jogo(liga.getJogos().size() + 2, temperatura, equipe1, equipe2);
                    liga.jogarJogo(jogo1);
                    liga.jogarJogo(jogo2);
                    break;
                } else {
                    Equipe equipe1 = gerarEquipeAleatoria(liga);
                    Equipe equipe2 = gerarEquipeAleatoria(liga);
                    while (equipe1 == equipe2) {
                        equipe1 = gerarEquipeAleatoria(liga);
                    }
                    Jogo jogo = new Jogo(liga.getJogos().size() + 1, temperatura, equipe1, equipe2);
                    liga.jogarJogo(jogo);
                    break;
                }
            }
        }
        System.out.println("Temporada encerrada!\n");
        liga.imprimirEstatisticas();
        teclado.close();
    }
    private static Equipe gerarEquipeAleatoria(LigaFutebol liga) {
        Random random = new Random();
        if (liga.getEquipes().isEmpty()){
            throw new IllegalStateException("A lista de equipes está vazia!");
        }
        int indiceEquipe = random.nextInt(liga.getEquipes().size());
        return liga.getEquipes().get(indiceEquipe);
    }
}