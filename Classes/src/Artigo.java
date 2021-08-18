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
        public boolean temEstoque(){
        return estoque;
        }
        public double consultarPreco(){
        return preco_venda;
        }


}
