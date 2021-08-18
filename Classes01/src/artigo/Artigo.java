package artigo;

public class Artigo {
    // ATRIBUTOS
    private String descricao;
    private double preco_venda;
    private int estoque;


    //CONSTRUTORES
    public Artigo(String descricao, int quantidade, double preco){
        this.descricao = descricao;
        this.preco_venda = preco;
        this.estoque = quantidade;
    }
    //MÉTODOS
    // O IDEA está pedindo pra mudar boolean para int
    public boolean temEstoque() {
        return estoque;
    }
    public double consultarPreco(){

        return preco_venda;
    }

    //Os métodos get permitem que você
    //acesse o valor de um atributo para uma
    //consulta ou use esse valor em outra operação.

    public String getDescricao(){
        return descricao;}
    public double getPrecoVenda(){
        return preco_venda;}
    public int getEstoque(){
        return estoque;}


    // Os métodos set permitem alterar o valor de um
    //atributo, receber o novo valor como parâmetro e
    //atribuí-lo ao atributo correspondente.

    public void setDescricao(String descricao){
        this.descricao = descricao;}
    public void setPrecoVenda(double preco){
        this.preco_venda = preco;}
    public void setEstoque(int estoque){
        this.estoque = estoque;}

}
