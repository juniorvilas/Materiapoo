package Aula11Mesa;

public class Poupanca extends Conta{
    private double saldo;
    private String taxaJuros;

    public Poupanca(Clientes clienteAssociado, double saldo, String taxaJuros) {
        super(clienteAssociado);
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
    }

    public String cobrarJuros() {
        return null;
    }

    @Override
    public String depositar() {
        return "Depósito em conta poupança";
    };
    public String sacar() {
        return "Saque da conta poupança";
    }

    @Override
    public String mostrarSaldo() {
        return "Seu saldo é de "+saldo;
    }

    ;



}
