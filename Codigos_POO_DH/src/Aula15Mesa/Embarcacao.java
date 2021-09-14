package Aula15Mesa;

public abstract class Embarcacao  {

    private double precoBase;
    private double valorAdicional;
    private int anoFab;
    private double compMetros;
    private Capitao capitao;

    public Embarcacao(double precoBase, double valorAdicional, int anoFab, double compMetros) {
        this.precoBase = precoBase;
        this.valorAdicional = valorAdicional;
        this.anoFab = anoFab;
        this.compMetros = compMetros;
    }

    public Capitao getCapitao() {
        return capitao;
    }

    public void setCapitao(Capitao capitao) {
        this.capitao = capitao;
    }

    public double aluguel() {
        if(anoFab > 2020)
            return precoBase + valorAdicional;
        else
            return precoBase;
    }



}
