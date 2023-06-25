class Terminal {
    private Cartao cartao;
    private CategoriaPremio[] categoriasPremio;

    public Terminal (Cartao cartao, CategoriaPremio[] categoriasPremio) {
        this.cartao = cartao;
        this.categoriasPremio = categoriasPremio;
    }

    public void carregarCreditos(int quantidade) {
        cartao.carregarCreditos(quantidade);
    }

    public void jogarJogo() {
        cartao.jogarJogo();
    }

    public void transferirCreditos(Cartao destino, int quantidade) {
        cartao.transferirCreditos(destino, quantidade);
    }

    public void solicitarPremio(String nomePremio) {
        Premio premio = null;
        for (CategoriaPremio categoria : categoriasPremio) {
            if (categoria.getNome().equals(nomePremio)) {
                premio = new Premio (nomePremio, categoria.getTicketsRequeridos());
                break;
            }
        }
        if (premio != null) {
            cartao.solicitarPremio(this, premio);
        } else {
            System.out.println("Prêmio não encontrado!");
        }
    }

    public boolean verificarDisponibilidade(Premio premio) {
        for (CategoriaPremio categoria : categoriasPremio) {
            if (categoria.getNome().equals(premio.getNome())) {
                return categoria.getQuantidadeDisponivel() > 0;
            }
        }
        return false;
    }

    public void concederPremio(Premio premio) {
        for (CategoriaPremio categoria : categoriasPremio) {
            if (categoria.getNome().equals(premio.getNome())) {
                categoria.reduzirQuantidadeDisponivel();
                System.out.println("Prêmio " + premio.getNome() + " concedido.");
                break;
            }
        }
    }

    public void mostrarSaldoCartao() {
        System.out.println("Saldo de créditos do cartão " + cartao.getNumero() + ": " + cartao.getSaldoCreditos());
        System.out.println("Saldo de tíquetes do cartão " + cartao.getNumero() + ": " + cartao.getSaldoTickets());
    }
}
