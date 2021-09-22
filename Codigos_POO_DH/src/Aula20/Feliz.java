package Aula20;

public class Feliz implements Estado{

    private Tamagochi t;

    public Feliz(Tamagochi t) {
        this.t = t;
    }

    @Override
    public void bebe() {
        System.out.println("Beep 5x");
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
