//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // STATIC - NAO USA PROGRAMACAO ORIENTADO A OBJETOS
    public static void main(String[] args) {

        // Produto -
        // tamanho, preco, cor, unidade, marca, nome

        // OBJETO
        // TIPO NOME = new TIPO();
        Produto prod1 = new Produto("Monitor", 800, "Dell", 80);
        //             Instanciar a Classe

        prod1.mostrarInformacoes();

        Produto prod2 = new Produto("Notebook", 3000, "Dell", 100);


        prod2.mostrarInformacoes();


        // //////// Ex1
        // OBJETO
        Musica musica1 = new Musica("Barbie", "Tutu", 321);


        System.out.println(musica1.titulo);
        System.out.println(musica1.artista);
        System.out.println(musica1.duracaoEmSegundos);

        // /////////EX2
        // OBJETO
        Carro carro1 = new Carro("Fiat", "Uno", "Branco");

        // Ou Assim
        /*carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.descricao = "Branco";*/

        carro1.mostrarInformacoes();

        Carro carro2 = new Carro("Honda", "Fit", "Vermelho");

        //Ou assim
        /*carro2.marca = "Honda";
        carro2.modelo = "Fit";
        carro2.descricao = "Vermelho";*/

        carro2.mostrarInformacoes();

        // /////////Ex3

        Aluno aluno1 = new Aluno("Joao", 5.80);

        // Ou assim
        /*aluno1.nome = "Joao";
        aluno1.nota = 5.80;*/
        aluno1.verificarStatus();

        Aluno aluno2 = new Aluno("Maria", 7);

        // Ou assim
        /*aluno2.nome = "Maria";
        aluno2.nota = 7;*/
        aluno2.verificarStatus();


        // /////////Ex4

        ContaBancaria conta = new ContaBancaria();

        conta.saldo = 3000;
        conta.titular = "Ismael";

        conta.depositar(500);
        conta.sacar(200);

        System.out.println(conta.saldo);

    }
}