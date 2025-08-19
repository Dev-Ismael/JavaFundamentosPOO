public class Pessoa {

    // Atributos
    protected String nome;

    // Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Metodo GET - Pegar uma informacao e devolver para quem chamou
    public String getNome() {
        return nome;
    }
}
