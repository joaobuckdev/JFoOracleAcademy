
class Premio {
    private String nome;
    private int ticketsRequeridos;

    public Premio(String nome, int ticketsRequeridos) {
        this.nome = nome;
        this.ticketsRequeridos = ticketsRequeridos;
    }
    
    public String getNome() {
        return nome;
    }

    public int getTicketRequeridos() {
        return ticketsRequeridos;
    }
}