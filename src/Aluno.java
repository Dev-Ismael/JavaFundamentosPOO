public class Aluno {
    // /////////Ex3
    // Atributo
    public String nome;
    public double nota;

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
