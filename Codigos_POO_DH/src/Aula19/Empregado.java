package Aula19;

public abstract class Empregado {
    private String nome;
    private String sobrenome;
    private String arquivo;

    public Empregado(){}
    public Empregado(String nome, String sobrenome, String arquivo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.arquivo = arquivo;
    }

    public abstract Double calcularSalario();

}
