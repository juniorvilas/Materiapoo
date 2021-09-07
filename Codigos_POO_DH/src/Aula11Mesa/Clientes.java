package Aula11Mesa;

public class Clientes {
    private int numCliente;
    private String sobrenome;
    private int cpf;
    private String conta;

    public Clientes(int numCliente, String sobrenome, int cpf, String conta) {
        this.numCliente = numCliente;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "numCliente=" + numCliente +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf=" + cpf +
                ", conta='" + conta + '\'' +
                '}';
    }
}
