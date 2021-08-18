package Aula05Mesa01;

public class UsuarioJogo {
    // ATRIBUTOS
    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    //METODO CONSTRUTOR

    public UsuarioJogo (String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
        this.pontuacao = 0;
        this.nivel = 1;
    }

    //METODOS

    //CONSULTA O NOME OU NICK
    public String getNome() {
        return  this.nome;
    }
    public String getNickname() {
        return  this.nickname;
    }

    //CONSULTA PONTUACAO
    public int getPontuacao() { return this.pontuacao; }

    //CONSULTA NIVEL
    public int getNivel() { return this.nivel; }

    //Altera o numero do cliente ou nickname
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNickname(String nome) {
        this.nickname = nickname;
    }



    //aumentarPontuacao()
    public String aumentarPontuacao(int valor) {
        this.pontuacao = pontuacao + valor;
        return "Sua pontuação é: " + this.pontuacao;
    }

    //bonus(int valor)
    public String bonus() {
        this.pontuacao = pontuacao + 10;
        return "Seu bonus é de 10pts e sua pontuação é: " + this.pontuacao;
    }

    //subirNivel()
    public String subirNivel() {
        this.nivel = nivel + 1;
        return "Seu nivel agora é: " + this.nivel;
   }















}
