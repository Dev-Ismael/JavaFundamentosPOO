public class Atleta extends Pessoa {
    // Atributo
    public String esporte;

    // Construtor

    public Atleta( String nome, String esporte) {
        super(nome);
        this.esporte = esporte;
    }

    // Metodo GET
    public String getEsporte() {
        return esporte;
    }
}
