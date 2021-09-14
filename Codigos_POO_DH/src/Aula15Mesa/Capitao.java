package Aula15Mesa;

public class Capitao {

    private String nome;
    private String apelido;
    private String registro;

    public Capitao(String nome, String apelido, String registro) {
        this.nome = nome;
        this.apelido = apelido;
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "Capitao{" +
                "nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", registro='" + registro + '\'' +
                '}';
    }
}
