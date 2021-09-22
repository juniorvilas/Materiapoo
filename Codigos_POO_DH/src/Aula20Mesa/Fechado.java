package Aula20Mesa;

public class Fechado implements Estado{

    private Carrinho c;

    public Fechado(Carrinho c) {
        this.c = c;
    }

    @Override
    public void adicionar(Produto p) {
        System.out.println("Não aceita novos produtos. Faça uma nova compra.");
    }

    @Override
    public void cancelar() {
        c.setEstado(new Vazio(c));
        System.out.println("Carrinho vazio novamente.");
    }

    @Override
    public void retornar() {
        System.out.println("Compra finalizada, carrinho fechado. Faça uma nova compra.");
    }

    @Override
    public void proximo() {
        c.setEstado(new Vazio(c));
        System.out.println("Carrinho vazio, adicione novos produtos.");
    }

    @Override
    public String toString() {
        return "Fechado{" +
                "c=" + c +
                '}';
    }
}
