import javax.swing.JOptionPane;

public class JFoSection3 {
  /* Problema 4: Criar um Jogo do Java Libs */
  public static void main(String args[]) {
    String nome = JOptionPane.showInputDialog("Para começar, insira seu nome:");
    String idadeAtualString = JOptionPane.showInputDialog("Agora, insira sua idade");
    String localViagem = JOptionPane.showInputDialog("Insira um local qual que tem o interesse de viajar:");
    String destino = JOptionPane.showInputDialog("Qual é seu destino de sonho desta viagem?");
    String tipoViagem = JOptionPane.showInputDialog("Insira qual o tipo de viagem gostaria que fosse:");
    String atividade = JOptionPane.showInputDialog("Insira sua atividade favorita, que gostaria\nde fazer durante esta viagem:");
    String climaIdeal = JOptionPane.showInputDialog("Qual o clima ideal que gostaria de ter nesta viagem?");
    String acompanhantes = JOptionPane.showInputDialog("Com mais quantas pessoas você gostaria de ir?");
    String duracaoViagem = JOptionPane.showInputDialog("Quanto tempo gostaria que durasse esta viagem?");
    String numeroDaSorteString = JOptionPane.showInputDialog("Insira o seu número da sorte:");

    int idadeAtual = Integer.parseInt(idadeAtualString);
    double numeroDaSorte = Double.parseDouble(numeroDaSorteString);
    numeroDaSorte = numeroDaSorte/100;

    JOptionPane.showMessageDialog(null, numeroDaSorte);

    double tempo = 30*numeroDaSorte;
    int idadeFuturo = idadeAtual + (int) tempo;

    String historia = nome + ", aos " + idadeFuturo + " anos, você estará viajando para " + localViagem + " com " + acompanhantes + " acompanhantes" + ", e \nestará vivenciando uma incrível experiência de " + tipoViagem +
      ". Sua viagem durará " + duracaoViagem + ",\ne durante sua viagem, você terá bastante tempo para realizar sua atividade favorita: " + atividade + "\n" +
      "Você também visitará um dos seus destinos, o/a " + destino + " e o clima estará predominantemente: " + climaIdeal + "."; 

      JOptionPane.showMessageDialog(null, historia, "Java Libs: História", JOptionPane.INFORMATION_MESSAGE);
    }
}