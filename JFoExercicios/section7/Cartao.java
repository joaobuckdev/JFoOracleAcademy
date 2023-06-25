import java.util.Random;

class Cartao {
    private int numero;
    private int saldoCreditos;
    private int saldoTickets;

    public Cartao(int numero) {
        this.numero = numero;
        this.saldoCreditos = 0;
        this.saldoTickets = 0;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldoCreditos() {
        return saldoCreditos;
    }

    public int getSaldoTickets() {
        return saldoTickets;
    }

    public void carregarCreditos(int quantidade) {
        saldoCreditos += quantidade;
        System.out.println("Créditos carregados no cartão " + numero + ": " + quantidade + ".");
    }

    public void jogarJogo() {
        if (saldoCreditos >= 2) {
            saldoCreditos -= 2;
            Random random = new Random();
            int tickets = random.nextInt(10);
            saldoTickets += tickets;
            System.out.println("Cartão " + numero + " jogou um jogo. Tíquetes ganhos: " + tickets + ".");
        } else {
            System.out.println("Créditos insuficientes no cartão" + numero + " para jogar este jogo.");
        }
    }

    public void transferirCreditos(Cartao destino, int quantidade) {
        if (saldoCreditos >= quantidade) {
            saldoCreditos -= quantidade;
            destino.saldoCreditos += quantidade;
            System.out.println("Créditos transferidos do cartão " + numero + " para o cartão " + destino.getNumero() + ": " + quantidade + ".");
        } else { 
            System.out.println("Créditos insuficientes no cartão " + numero + " para realizar esta transferência!");
        }
    }

    public void solicitarPremio(Terminal terminal, Premio premio) {
        if (saldoTickets>= premio.getTicketRequeridos() && terminal.verificarDisponibilidade(premio)) {
            terminal.concederPremio(premio);
            System.out.println("Cartão " + numero + " solicitou o prêmio " + premio.getNome() + ".");
        } else {
            System.out.println("Tíquetes insuficientes no cartão " + numero + " ou prêmio indisponível no terminal!");
        }
    }
} 
