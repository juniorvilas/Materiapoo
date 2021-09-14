package Aula15Mesa;

public class Iates extends Embarcacao implements Comparar{

    private int cabines;

    public Iates(double precoBase, double valorAdicional, int anoFab, double compMetros, int cabines) {
        super(precoBase, valorAdicional, anoFab, compMetros);
        this.cabines = cabines;
    }


    @Override
    public void eLuxuoso(Iates iates) {
        if(this.cabines > iates.cabines)
            System.out.println("É Mais luxuoso");
        else
            System.out.println("Não é mais luxuoso");

    }
}
