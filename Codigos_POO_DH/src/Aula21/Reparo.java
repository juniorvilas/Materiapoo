package Aula21;

public class Reparo {

    private Estado estado;
    private String nomeItem;
    private double custo;
    private String endereco;

    // CONSTRUTOR
    public Reparo(String nomeItem, double custo, String endereco){
        this.estado = new Orcamento(this);
        this.nomeItem = nomeItem;
        this.custo = custo;
        this.endereco = endereco;
    }



    //GET AND SET
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    //ESTADOS
    public void mudarEndereco() {
        this.estado.mudarEndereco();
    }
    public void darOrcamento(){
        this.estado.darOrcamento();
    }
    public void addItensExtra(){
        this.estado.addItensExtra();
    }
    public void proximoEstado(){
        this.estado.proximoEstado();
    }

    @Override
    public String toString() {
        return "Reparo{" +
                "estado=" + estado +
                ", nomeItem='" + nomeItem + '\'' +
                ", custo=" + custo +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
