package Aula22Mesa;

import java.util.ArrayList;

public class Combo implements Figura{

    ArrayList<Figura> listaDeAreas;

    public Combo() {
        this.listaDeAreas = new ArrayList<>();
    }

    @Override
    public double calcularArea() {
        double areaTotal = 0;
        for(Figura figura : listaDeAreas) {
            areaTotal += figura.calcularArea();
        }

        return areaTotal;
    }

    public void addArea(Figura figura) {
        listaDeAreas.add(figura);
    }
}
