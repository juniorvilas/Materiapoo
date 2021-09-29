package Aula22;

public class Produto implements Carrinho {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularPreco() {
        return this.preco;
    }
}
