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


    // 2 - Método
    // Mostrar informacao do Produto
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Marca: " + marca);
    }
};