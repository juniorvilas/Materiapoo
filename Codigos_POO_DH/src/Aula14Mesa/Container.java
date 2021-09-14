package Aula14Mesa;

public class Container implements Comparar {

    private int numero;
    private Boolean perigoso;
    private String paisOrigem;

    public Container(int numero, Boolean perigoso, String paisOrigem) {
        this.numero = numero;
        this.perigoso = perigoso;
        this.paisOrigem = paisOrigem;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Boolean getPerigoso() {
        return perigoso;
    }

    public void setPerigoso(Boolean perigoso) {
        this.perigoso = perigoso;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }


    @Override
    public int compararTo(Container container) {
        if (this.numero == container.numero) {
            return 0;
        } else if (this.numero > container.numero) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Container{" +
                "numero=" + numero +
                ", perigoso=" + perigoso +
                ", paisOrigem='" + paisOrigem + '\'' +
                '}';
    }
}

