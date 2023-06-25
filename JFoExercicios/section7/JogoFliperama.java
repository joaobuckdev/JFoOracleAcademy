class JogoFliperama {
    private String nome;
    private int creditosRequeridos;

    public JogoFliperama(String nome, int creditosRequeridos) {
        this.nome = nome;
        this.creditosRequeridos = creditosRequeridos;
    }

    public int getCreditosRequeridos() {
        return creditosRequeridos;
    }

    public void jogar() {
        System.out.println("Jogando o jogo " + nome);
    }
}