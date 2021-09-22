package Aula20;

public class Fome implements Estado{

    private Tamagochi t;


    public Fome (Tamagochi t) {
        this.t = t;
    }


    @Override
    public void bebe() {
        t.setEstado(new Feliz(t));
    }

    @Override
    public void come() {
        t.setEstado(new Feliz(t));
    }

    @Override
    public void carinho() {
        System.out.println("Sem mudança");
    }
}
