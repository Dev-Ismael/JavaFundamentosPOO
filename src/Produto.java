import java.sql.SQLOutput;
// public class NOME {}
public class Produto {
    // 1 - Atributo
    // public TIPO NOME;
    public String nome;
    public double tamanho;
    public double preco;
    public String cor;
    public int unidade;
    public String marca;

    // GET - PEGAR
    public String getNome() {
        return nome;
    }
    // SET - DEFINIR, MUDAR
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Construtor
    public Produto(String nome, double preco, String marca, double tamanho){
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.tamanho = tamanho;
    }

    // 2 - Método
    // Mostrar informacao do Produto
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Marca: " + marca);
    }
};