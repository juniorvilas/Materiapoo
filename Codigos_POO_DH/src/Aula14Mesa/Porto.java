package Aula14Mesa;

import java.util.ArrayList;

public class Porto {

    private String nomePorto;

    private ArrayList<Container> containers = new ArrayList<Container>();

    public Porto(String nomePorto) {
        this.nomePorto = nomePorto;
    }

    public Porto(ArrayList<Container> containers) {
        this.containers = containers;
    }

    public void adicionarContainer(Container container) {
        this.containers.add(container);
    };

    public void ordenar() {
        containers.sort((container1, container2) -> container1.compararTo(container2));
        for(Container container: containers) {
            System.out.println(container.getNumero() + " " + container.getPaisOrigem());
        }
    };

    public int quantidadePerigoso() {
        int contador = 0;
        for(Container container: containers) {
            if (container.getPerigoso()  && container.getPaisOrigem().equalsIgnoreCase("Desconhecido")) {
                contador++;
            }
        }
        return contador;


    };

    @Override
    public String toString() {
        return "Porto{" +
                "nomePorto='" + nomePorto + '\'' +
                '}';
    }
}
