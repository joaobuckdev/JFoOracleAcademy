class Jogo {
    private int id;
    private int temperatura;
    private Equipe equipe1;
    private Equipe equipe2;

    public Jogo(int id, int temperatura, Equipe equipe1, Equipe equipe2) {
        this.id = id;
        this.temperatura = temperatura;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }

    public int getId() {
        return id;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public Equipe getEquipe1() {
        return equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }
}