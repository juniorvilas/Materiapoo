package Aula10;

public class Associado {
    private String numAssociado;
    private String nome;
    private double valorMensal;
    private String atividade;


    //METODO CONSTRUTOR
    public Associado(String numAssociado, String nome,double valorMensal, String atividade ) {
        this.numAssociado = numAssociado;
        this.nome = nome;
        this.valorMensal = valorMensal;
        this.atividade = atividade;
    }

    //METODO CUSTOMENSAL
    public double custoMensal(){
        return  this.valorMensal;
    }

}
