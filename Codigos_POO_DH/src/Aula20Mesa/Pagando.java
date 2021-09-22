package Aula20Mesa;

public class Pagando implements Estado{

    private Carrinho c;

    public Pagando(Carrinho c) {
        this.c = c;
    }

    @Override
    public void adicionar(Produto p) {
        System.out.println("Não aceita mais produtos!");
    }

    @Override
    public void cancelar() {
        c.setEstado(new Vazio(c));
        System.out.println("Carrinho vazio novamente.");
    }

    @Override
    public void retornar() {
        c.setEstado(new Carregando(c));
        System.out.println("Carrinho carregando");
    }

    @Override
    public void proximo() {
        c.setEstado(new Fechado(c));
        System.out.println("Compra finalizada com sucesso!");
    }

    @Override
    public String toString() {
        return "Pagando{" +
                "c=" + c +
                '}';
    }
}
