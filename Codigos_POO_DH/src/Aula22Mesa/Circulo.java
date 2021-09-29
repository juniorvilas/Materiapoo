package Aula22Mesa;

public class Circulo implements Figura{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (this.raio * this.raio);
    }
}
