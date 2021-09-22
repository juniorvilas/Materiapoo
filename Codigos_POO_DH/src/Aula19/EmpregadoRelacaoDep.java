package Aula19;

public class EmpregadoRelacaoDep extends Empregado{
    private double valorMensal;

    public EmpregadoRelacaoDep(){}
    public EmpregadoRelacaoDep(String nome, String sobrenome, String arquivo, double valorMensal) {
        super(nome, sobrenome, arquivo);
        this.valorMensal = valorMensal;
    }

    @Override
    public Double calcularSalario() {
        return this.valorMensal;
    }
}
