package Aula20;

public class Sede implements Estado {

    private Tamagochi t;


    public Sede (Tamagochi t) {
        this.t = t;
    }

    @Override
    public void bebe() {
        System.out.println("Tava na hora!");
    }

    @Override
    public void come() {
        System.out.println("Sem mudança");
    }

    @Override
    public void carinho() {
        System.out.println("Sem mudança");
    }
}
