public class Carro {

    // ///////Ex2
    // Atributos
    public String marca;
    public String modelo;
    public String descricao;

    // Construtores
    public Carro(String marca, String modelo, String descricao) {
        this.marca = marca;
        this.modelo = modelo;
        this.descricao = descricao;
    }

    // Metodos
    public void mostrarInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Descricao: " + descricao);
    }
}
