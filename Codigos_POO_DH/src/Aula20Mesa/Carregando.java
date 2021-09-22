package Aula20Mesa;

import java.util.List;

public class Carregando implements Estado {

    private Carrinho c;

    public Carregando(Carrinho c) {
        this.c = c;
    }

    @Override
    public void adicionar(Produto p) {
        c.setListaProdutos(p);
    }

    @Override
    public void cancelar() {
        c.setEstado(new Vazio(c));
        System.out.println("Está vazio novamente");
    }

    @Override
    public void retornar() {
        c.setEstado(new Vazio(c));
        System.out.println("Cancelado! Está vazio novamente");
    }

    @Override
    public void proximo() {
        c.setEstado(new Pagando(c));
    }

    @Override
    public String toString() {
        return "Carregando{" +
                "c=" + c +
                '}';
    }
}
