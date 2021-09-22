package Aula20Mesa;

public interface Estado {

    public void adicionar(Produto p);
    public void cancelar();
    public void retornar();
    public void proximo();
}
