package Aula23Mesa;

import java.util.ArrayList;

public class Programa implements Interface{

    ArrayList<Interface> listacursos;

    public Programa() {
        this.listacursos = new ArrayList<>();
    }

    public void addCurso(Interface curso) {
        listacursos.add(curso);
    }

    @Override
    public double calcularPreco() {
        double valorTotal = 0;

        for (Interface curso:  listacursos) {
            valorTotal += curso.calcularPreco() * 0.8;
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "listacursos=" + listacursos +
                '}';
    }
}
