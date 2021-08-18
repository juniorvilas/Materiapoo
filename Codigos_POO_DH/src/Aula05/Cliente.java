package Aula05;

public class Cliente {
    // ATRIBUTOS
    private int numeroCliente;
    private String nome;
    private double divida;

    //CONSTRUTORES
    public Cliente(int numeroCliente, String nome) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.divida = 0;
    }
    //METODO get
    //Os métodos get permitem que você
    //acesse o valor de um atributo para uma
    //consulta ou use esse valor em outra operação.

    //mostra o numero do cliente
    public int getNumeroCliente() {
        return this.numeroCliente;
    }
    //mostra o nome do cliente
    public String getNome() {
        return  this.nome;
    }

    //mostra a divida do cliente
    public double getDivida() {
        return this.divida;
    }

    //METODO set
    // Os métodos set permitem alterar o valor de um
    //atributo, receber o novo valor como parâmetro e
    //atribuí-lo ao atributo correspondente.

    //Altera o numero do cliente
    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    //Altera o numero do cliente
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Alera a divida do cliente
    public void setDivida(double divida){
        this.divida = divida;
    }

    //aumenta o valor da divida
    public String aumentarDivida(double valor) {
        this.divida = divida + valor;
        return "Sua divida aumentou: " + this.divida;
    }

    //zera a divida
    public String pagarDivida() {
        this.divida = 0;
        return "Você pagou sua divida";
    }


}
