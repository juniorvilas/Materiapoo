package Aula20;

public class Principal {
    public static void main(String[] args) {

        Tamagochi tama = new Tamagochi();

        tama.bebe();
        tama.carinho();
        System.out.println(tama.getEstado().getClass());


    }
}
