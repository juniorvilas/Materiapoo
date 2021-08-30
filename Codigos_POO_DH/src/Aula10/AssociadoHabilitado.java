package Aula10;

public class AssociadoHabilitado extends Associado{

    private double custoPiscina;
    private boolean habilitado;

    //METODO CONSTRUTOR
    public AssociadoHabilitado(String numero, String nome, String atividade, double valor, double custoPiscina ) {

        super(numero, nome, valor, atividade);
        this.custoPiscina = custoPiscina;

    }

    //SETTER E GETTER
    public double getCustoPiscina() {
        return custoPiscina;
    }

    public void setCustoPiscina(double custoPiscina) {
        this.custoPiscina = custoPiscina;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    //SOBREESCREVENDO O METODO CUSTOMENSAL
    @Override
    public double custoMensal() {
        if (this.habilitado)
            return super.custoMensal() + this.custoPiscina;
        else
            return super.custoMensal();
    }

}
