package Aula20;

public class Tamagochi {

    private Estado estado;

    public Tamagochi() {
        this.estado = new Feliz(this);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void bebe() {
        this.estado.bebe();
    }

    public void come(){
        this.estado.come();
    }

    public void carinho(){
        this.estado.carinho();
    }

    @Override
    public String toString() {
        return "Tamagochi{" +
                "estado=" + estado +
                '}';
    }
}
