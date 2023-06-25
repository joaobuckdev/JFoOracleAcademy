class CategoriaPremio {
    private String nome;
    private int ticketsRequeridos;
    private int quantidadeDisponivel;

    public CategoriaPremio(String nome, int ticketsRequeridos, int quantidadeDisponivel) {
        this.nome = nome;
        this.ticketsRequeridos = ticketsRequeridos;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getNome() {
        return nome;
    }

    public int getTicketsRequeridos() {
        return ticketsRequeridos;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void reduzirQuantidadeDisponivel() {
        quantidadeDisponivel--;
    }
}