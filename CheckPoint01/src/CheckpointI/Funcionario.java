package CheckpointI;
// CLASSE FUNCIONARIO
public abstract class Funcionario {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String endereco;
    private String matricula;
    private double salario;
    private double comissao;
    // GETTERS E SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    //CONSTRUTOR
    public Funcionario(String nome, String sobrenome, String cpf, String endereco,
                       String matricula, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.matricula = matricula;
        this.salario = salario;
    }
    //MÉTODO ABSTRATO DE PAGAMENTO
    public abstract void pagamento();
    //SOBSCRIÇÃO DO MÉTODO TOSTRING
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", matricula='" + matricula + '\'' +
                ", salario=" + salario +
                '}';
    }
}
