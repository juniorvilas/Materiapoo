package Aula10Mesa;

public class Nave extends Objeto{
    private double velocidade;
    private int vida;

    public Nave(int x, int y, char direcao, double velocidade, int vida){
        super (x,y,direcao);
        this.velocidade =velocidade;
        this.vida = vida;
    }

    @Override
    public void irA(int x, int y, char direcao) {
        if(super.getDirecao() != direcao) {
            super.setDirecao(direcao);
            super.setPosx(x);
            super.setPosy(y);
        } else {
            super.setPosx(x);
            super.setPosy(y);
        }
    }
    public void girar(char direcao) {
        super.setDirecao(direcao);
    }
    public int restaVida(){
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

}
