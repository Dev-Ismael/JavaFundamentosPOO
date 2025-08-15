public class Aluno {
    // /////////Ex3
    // Atributo
    public String nome;
    public double nota;

    // Construtores
    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    // Metodo
    public void verificarStatus() {
        if(nota >= 7){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
