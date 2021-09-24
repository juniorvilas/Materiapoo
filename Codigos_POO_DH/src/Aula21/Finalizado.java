package Aula21;

public class Finalizado implements Estado{

    private Reparo reparo;

    public Finalizado(Reparo reparo){
        this.reparo = reparo;
    }

    @Override
    public void mudarEndereco() {
        System.out.println("Pedido Finalizado não pode mudar de endereço!");
    }

    @Override
    public void darOrcamento() {
        System.out.println("Pedido Finalizado não pode inserir Orçamento!");
    }

    @Override
    public void addItensExtra() {
        System.out.println("Pedido Finalizado não pode inserir itens!");
    }

    @Override
    public void proximoEstado() {
        System.out.println("Pedido Finalizado não existe próximo estado!");

    }
}
