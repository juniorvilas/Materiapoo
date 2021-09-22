package Aula20Mesa;

import java.util.List;

public class Vazio implements Estado{

    private Carrinho c;




    public Vazio(Carrinho c) {
        this.c = c;
        c.esvaziarCarrinho();
    }

    @Override
    public void adicionar(Produto p) {
        c.setEstado(new Carregando(c));
        c.setListaProdutos(p);
        System.out.println("Produto " + p + " adicionado.");
    }

    @Override
    public void cancelar() {
        System.out.println("Já está vazio");
    }

    @Override
    public void retornar() {
        System.out.println("Está vázio, não pode cancelar");
    }

    @Override
    public void proximo() {
        c.setEstado(new Carregando(c));
    }

    @Override
    public String toString() {
        return "Vazio{" +
                "c=" + c +
                '}';
    }
}
