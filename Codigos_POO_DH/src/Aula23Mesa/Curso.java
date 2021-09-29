package Aula23Mesa;

public class Curso implements Interface{

    private String nome;
    private String descricao;
    private double valorHora;
    private double cargaHoraria;

    public Curso(String nome, String descricao, double valorHora, double cargaHoraria) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularPreco() {
     return this.valorHora * this.cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Nome: " + nome + '\'' +
                ", Descricao: " + descricao + '\'' +
                ", Tem uma carga horária de : " + cargaHoraria + " horas "+ '\'' +
                ", com um preço de : " + valorHora + " reais por hora "+'\'' +
                ", ou seja, tem um preço de: " + calcularPreco() + '\''+
                '}';
    }
}
