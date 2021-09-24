package Aula21;

public class Reparacao implements Estado{

    private Reparo reparo;

    public Reparacao(Reparo reparo){
        this.reparo = reparo;
    }


    @Override
    public void mudarEndereco() {
        System.out.println("Não pode mudar de endereço!");
    }

    @Override
    public void darOrcamento() {
        System.out.println("Não pode inserir Orçamento!");
    }

    @Override
    public void addItensExtra() {

    }

    @Override
    public void proximoEstado() {
        this.reparo.setEstado(new ParaEnvio(reparo));
        System.out.println(this.reparo.toString());
    }

    public void addItens(double valor, String peca) {
        this.reparo.setCusto(valor + reparo.getCusto());
        this.reparo.setNomeItem(peca);
        System.out.println("Peça: "+ peca + " valor: " + valor);
    }
}
