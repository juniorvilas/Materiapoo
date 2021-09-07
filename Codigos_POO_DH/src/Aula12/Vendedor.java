package Aula12;

public class Vendedor extends Funcionario {

    private double salario;
    private double comissao;

    public Vendedor(String nome, String sobrenome, String cpf, double salario, double comissao) {
        super(nome, sobrenome, cpf);
        this.comissao = comissao;
        this.salario = salario;
    }

    @Override
    public void pagamento() {
        this.salario = this.salario + this.comissao;
        System.out.println("Seu pagamento será: " + this.salario );
    }
}
