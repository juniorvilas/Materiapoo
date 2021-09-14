package Aula15Mesa;

public class Veleiros extends Embarcacao implements Avaliar{

    private int mastros;

    public Veleiros(double precoBase, double valorAdicional, int anoFab, double compMetros, int mastros) {
        super(precoBase, valorAdicional, anoFab, compMetros);
        this.mastros = mastros;
    }


    @Override
    public void eGrande() {
        if(mastros > 4)
            System.out.println(" Veleiro é Grande!");
        else
            System.out.println(" Veleiro é Pequeno.");

    }
}
