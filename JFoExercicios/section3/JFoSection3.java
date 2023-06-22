import javax.swing.JOptionPane;

public class JFoSection3 {
  public static void main(String args[]) {
    String nome = JOptionPane.showInputDialog("Insira o seu nome:");
    JOptionPane.showMessageDialog(null, "Olá, " + name + "! Bem-vindo ao programa!");

    String inputString = JOptionPane.showInputDialog("Digite um valor inteiro:");
    int intValue = Integer.parseInt(inputString);
    JOptionPane.showMessageDialog(null, "O valor inteiro digitado foi: " + intValue);

    inputString = JOptionPane.showInputDialog("Digite um valor decimal:");
    double doubleValue = Double.parseDouble(inputString);
    JOptionPane.showMessageDialog(null, "O valor decimal digitado foi: " + doubleValue);

    int sum = intValue + 5;
    JOptionPane.showMessageDialog(null, "A soma do valor inteiro com 5 é: " + sum);

    double product = doubleValue * 2;
    JOptionPane.showMessageDialog(null, "O produto do valor decimal por 2 é: " + product);

    String message = "Resumo das entradas:";
    for (int i = 1; i <= 5; i++) {
      inputString = JOptionPane.showInputDialog("Digite a entrada " + i + ":");
      message += "\nEntrada " + i + ": " + inputString;
    }
    JOptionPane.showMessageDialog(null, message);
    }
}
  }
}