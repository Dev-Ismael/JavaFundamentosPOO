//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // STATIC - NAO USA PROGRAMACAO ORIENTADO A OBJETOS
    public static void main(String[] args) {

        // Produto -
        // tamanho, preco, cor, unidade, marca, nome

        // OBJETO
        // TIPO NOME = new TIPO();
        Produto prod1 = new Produto();
        //             Instanciar a Classe
        prod1.nome = "Monitor";
        prod1.preco = 850.00;
        prod1.marca = "Dell";

        prod1.mostrarInformacoes();

        Produto prod2 = new Produto();

        prod2.nome = "Notebook";
        prod2.preco = 3000.00;
        prod2.marca = "Dell";

        prod2.mostrarInformacoes();


        // //////// Ex1
        // OBJETO
        Musica musica1 = new Musica();
        musica1.titulo = "Barbie";
        musica1.artista = "Tutu";
        musica1.duracaoEmSegundos = 321;

        System.out.println(musica1.titulo);
        System.out.println(musica1.artista);
        System.out.println(musica1.duracaoEmSegundos);

        // /////////EX2
        // OBJETO
        Carro carro1 = new Carro();
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.descricao = "Branco";

        carro1.mostrarInformacoes();

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Fit";
        carro2.descricao = "Vermelho";

        carro2.mostrarInformacoes();

        // /////////Ex3

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Joao";
        aluno1.nota = 5.80;
        aluno1.verificarStatus();

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria";
        aluno2.nota = 7;
        aluno2.verificarStatus();

    }
}