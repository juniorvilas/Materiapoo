package Aula16;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String rg;
    private double saldoEmConta;
    private double limite;

    public Cliente(String nome, String sobrenome, String rg, double limite) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.limite= limite;
        saldoEmConta=0;
    }
    // thows prepara o java para possivel exceção
    public void comprar(double valor) throws ClientesException {
        if (valor > saldoEmConta + limite)
            //throw - lança a exceção
            throw new ClientesException(" Saldo insuficiente!!");
        else
            saldoEmConta-= valor;
    }

    public void pagarDivida(double valor) throws ClientesException{
        if (saldoEmConta > 0)
            //throw - lança a exceção
            throw new ClientesException(" Você não tem divida!!");
        else
            saldoEmConta+=valor;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                nome + ' ' +
                sobrenome + ' ' +
                ", seu saldo é=" + saldoEmConta + "R$ }";
    }
}