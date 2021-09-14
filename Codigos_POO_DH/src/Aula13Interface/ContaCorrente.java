package Aula13Interface;

public class ContaCorrente  extends Conta implements GravarImposto{

    private double valorPermitido;

    public ContaCorrente(double saldo) {
        super(saldo);
        this.valorPermitido = 100;
    }


    @Override
    public double imposto(double porc) {
        return 0;
    }
}
