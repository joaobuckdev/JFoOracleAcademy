public class TesteFliperama {
    public static void main(String[] args) {
        /* Seção 7: Um Encontro Noturno no Fliperama */
        Cartao cartao1 = new Cartao(1);
        Cartao cartao2 = new Cartao(2);
        
        cartao1.carregarCreditos(10);
        cartao2.carregarCreditos(5);

        CategoriaPremio[] categoriasPremio = {
            new CategoriaPremio("Avião de Brinquedo", 50, 10),
            new CategoriaPremio("Urso de Pelúcia", 10, 20),
            new CategoriaPremio("Pistola de Água", 15, 15),
            new CategoriaPremio("Robô Dançarino", 200, 5),
            new CategoriaPremio("Carrinho de Corrida", 5, 30)
        };
        Terminal terminal = new Terminal(cartao2, categoriasPremio);

        cartao1.jogarJogo();
        cartao2.jogarJogo();

        cartao1.transferirCreditos(cartao2, 3);

        terminal.solicitarPremio("Avião de Brinquedo");
        terminal.solicitarPremio("Urso de Pelúcia");
        terminal.solicitarPremio("Pistola de Água");
        terminal.solicitarPremio("Robô Dançarino");
        terminal.solicitarPremio("Carrinho de Corrida");

        cartao1.jogarJogo();
        terminal.solicitarPremio("Urso de Pelúcia");

        terminal.mostrarSaldoCartao();
    }
}