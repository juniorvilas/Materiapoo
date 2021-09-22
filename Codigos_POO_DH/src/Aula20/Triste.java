package Aula20;

public class Triste implements Estado{

    private Tamagochi t;


    public Triste (Tamagochi t) {
        this.t = t;
    }


    @Override
    public void bebe() {
        System.out.println("3x Beep - pisca");
    }

    @Override
    public void come() {
        System.out.println("2x Beep - vomitando");
    }

    @Override
    public void carinho() {
        t.setEstado(new Feliz(t));

    }
}
