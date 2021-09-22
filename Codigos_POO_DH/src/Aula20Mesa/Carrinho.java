package Aula20Mesa;


import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private Estado estado;
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public Carrinho () {
        this.estado = new Vazio(this);
    }

    public void esvaziarCarrinho(){
        listaProdutos.clear();
        System.out.println("Carrinho vazio novamente.");
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(Produto p) {
        this.listaProdutos.add(p);
    }

    public void adicionar(Produto p) {
        this.estado.adicionar(p);
    }

    public void cancelar() {
        this.estado.cancelar();
    }
    public void retornar() {
        this.estado.retornar();
    }
    public void proximo(){
        this.estado.proximo();
    }


}
