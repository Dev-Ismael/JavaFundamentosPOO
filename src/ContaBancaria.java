public class ContaBancaria {
    // ///////EX4
    // Atributo
    public String titular;
    public double saldo;

    // Metodos
    public void depositar(double valor){
        saldo = saldo + valor;
// OU assim    saldo += valor;
        // -=, *=, /=
    }
    public void sacar(double valor){
        saldo -= valor;
    }
}
