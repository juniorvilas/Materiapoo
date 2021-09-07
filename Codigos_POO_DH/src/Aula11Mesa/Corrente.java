package Aula11Mesa;

public class Corrente extends Conta{
    private double saldo;
    private double valorAutorizado;

    public Corrente(double saldo, double valorAutorizado, Clientes clienteAssociado) {
        super(clienteAssociado);
        this.saldo = saldo;
        this.valorAutorizado = valorAutorizado;
    }

    @Override
    public String depositar() {
        return "Depósito em conta corrente";
    };
    public String sacar() {
        return "Saque da conta corrente";
    }

    @Override
    public String mostrarSaldo() {
        return "Seu saldo é de "+saldo;
    }

    ;
}
