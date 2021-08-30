package Aula10Mesa;

public class Objeto {
    private int posx;
    private int posy;
    private char direcao;

    public Objeto( int x, int y, char direcao) {
        this.posx = x;
        this.posy = y;
        this.direcao = direcao;
    }

    public void irA(int x, int y, char direcao){
        this.posy = y;
        this.posx = x;
        this.direcao = direcao;
    }

    public int getPosy() {
        return posy;
    }

    public int getPosx() {
        return posx;
    }
    public void setPosy(int posy) {
        this.posy = posy;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }
}
