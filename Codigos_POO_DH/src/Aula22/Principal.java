package Aula22;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Misto",5.0);
        Produto produto2 = new Produto("Hamburguer",10.0);
        Combo combo = new Combo();
        combo.addProduto(produto);
        combo.addProduto(produto2);

        System.out.println(combo.calcularPreco());
    }
}
