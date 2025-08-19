public class Funcionario {
    protected String nome;
    public String CPF;
    public double salario;

    public Funcionario(String nome, String CPF, double salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
    }
}

// Classe de heranca nao se usa Private no atributo, e sim protected