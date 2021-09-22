package Aula19;

public class EmpregadoContratado  extends  Empregado{
    private double imposto;
    private double valorPorHora;

    public EmpregadoContratado(){}
    public EmpregadoContratado(String nome, String sobrenome, String arquivo, double imposto, double valorPorHora) {
        super(nome, sobrenome, arquivo);
        this.imposto = imposto;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public Double calcularSalario() {
        return this.imposto * this.valorPorHora;
    }

}
