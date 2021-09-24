package Aula21;



public class Orcamento implements Estado{

    private Reparo reparo;
    public Orcamento(Reparo reparo){
    this.reparo = reparo;
    }


    @Override
    public void mudarEndereco() {
        System.out.println("Não pode mudar de endereço!");
    }

    @Override
    public void darOrcamento() {
       // Scanner entrada = new Scanner(System.in);
      //  this.reparo.setCusto(50);
    }

    @Override
    public void addItensExtra() {
        System.out.println("Ainda não pode adicionar itens extras!");
    }

    @Override
    public void proximoEstado() {
        this.reparo.setEstado(new Reparacao(reparo));
        System.out.println(this.reparo.toString());

    }

    public void darOrcamento(double valor) {
        this.reparo.setCusto(valor);
        System.out.println("Valor do orçamento: " + valor);
    }

}
