import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LigaFutebol {
    private List<Equipe> equipes;
    private List<Jogo> jogos;
    private int temperaturaMaisAlta;
    private double temperaturaMedia;

    public List<Jogo> getJogos() {
        return jogos;
    }

    public LigaFutebol() {
        equipes = new ArrayList<>();
        jogos = new ArrayList<>();
        temperaturaMaisAlta = 0;
        temperaturaMedia = 0;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void adicionarEquipe(Equipe equipe) {
        equipes.add(equipe);
    }

    public void jogarJogo(Jogo jogo) {
        jogos.add(jogo);
        atualizarEstatisticasEquipes(jogo);
        atualizarEstatisticasTemperatura(jogo.getTemperatura());
    }

    public void imprimirEstatisticas() {
        System.out.println("Resultados:\n");

        for (Equipe equipe : equipes) {
            System.out.println(equipe.getNome());
            System.out.println("Vitórias: " + equipe.getVitorias() + ", Derrotas: " + equipe.getDerrotas() + ", Empates: " + equipe.getEmpates());
            System.out.println("Gols Marcados: " + equipe.getGolsMarcados() + ", Gols Sofridos: " + equipe.getGolsSofridos());
            System.out.println();
        }

        for (Jogo jogo : jogos) {
            System.out.println("Jogo #" + jogo.getId());
            System.out.println("Temperatura: " + jogo.getTemperatura());
            System.out.println("Equipe Visitante: " + jogo.getEquipe2().getNome() + ", " + gerarPlacarAleatorio());
            System.out.println("Equipe Casa: " + jogo.getEquipe1().getNome() + ", " + gerarPlacarAleatorio());
            System.out.println();
        }

        System.out.println("Temperatura mais alta: " + temperaturaMaisAlta);
        System.out.println("Temperatura Média: " + temperaturaMedia);
    }

    private void atualizarEstatisticasEquipes(Jogo jogo) {
        Equipe equipe1 = jogo.getEquipe1();
        Equipe equipe2 = jogo.getEquipe2();
        int golsVisitante = gerarPlacarAleatorio();
        int golsCasa = gerarPlacarAleatorio();

        equipe1.setGolsMarcados(equipe1.getGolsMarcados() + golsCasa);
        equipe1.setGolsSofridos(equipe1.getGolsSofridos() + golsVisitante);
        equipe2.setGolsMarcados(equipe2.getGolsMarcados() + golsVisitante);
        equipe2.setGolsMarcados(equipe2.getGolsSofridos() + golsCasa);

        if (golsVisitante > golsCasa) {
            equipe2.setVitorias(equipe2.getVitorias() + 1);
            equipe1.setDerrotas(equipe1.getDerrotas() + 1);
        } else if (golsCasa > golsVisitante) {
            equipe1.setVitorias(equipe1.getVitorias() + 1);
            equipe2.setDerrotas(equipe2.getDerrotas() + 1);
        } else {
            equipe2.setEmpates(equipe2.getEmpates() + 1);
            equipe1.setEmpates(equipe1.getEmpates() + 1);
        }
    }

    private void atualizarEstatisticasTemperatura(int temperatura) {
        if (temperatura > temperaturaMaisAlta) {
            temperaturaMaisAlta = temperatura;
        }
        temperaturaMedia = (temperaturaMedia * jogos.size() + temperatura) / (jogos.size() + 1);
    }

    private int gerarPlacarAleatorio() {
        Random random = new Random();
        return random.nextInt(6);
    }
}