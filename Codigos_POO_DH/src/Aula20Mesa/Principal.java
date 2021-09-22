package Aula20Mesa;

public class Principal {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Produto feijao = new Produto("Feijão",15);
        carrinho.adicionar(feijao);
        System.out.println(carrinho.getEstado().getClass());

    }
}
